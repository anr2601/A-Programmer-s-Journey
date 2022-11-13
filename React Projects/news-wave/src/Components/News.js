import React, {useEffect, useState} from 'react'
import NewsItem from './NewsItem'
import Spinner from './Spinner';
import PropTypes from 'prop-types'
import InfiniteScroll from 'react-infinite-scroll-component'

const News = (props) =>{

  const [articles, setArticles] = useState([])
  const [loading, setLoading] = useState(true)
  const [page, setPage] = useState(1)
  const [totalResults, setTotalResults] = useState(0)
  document.title = `${props.category[0].toUpperCase() + props.category.substring(1)}` + "-News Headlines"
 

  const updateNews = async() => {

    props.setProgress(10);
    const url = `https://newsapi.org/v2/top-headlines?country=${props.country}&category=${props.category}&apikey=${props.apiKey}&page=${page}&pageSize=${props.pageSize}`;    
    setLoading(true)
    let data = await fetch(url);
    props.setProgress(30)
    let parseddata = await data.json()
    props.setProgress(70)
   
    setArticles(parseddata.articles)
    setTotalResults(parseddata.totalResults)
    setLoading(false)
    props.setProgress(100);
  }

  useEffect( () => {
    updateNews();
  },[])
  
  const fetchData = async() => {

    setPage( page + 1 )
    const url = `https://newsapi.org/v2/top-headlines?country=${props.country}&category=${props.category}&apikey=${props.apiKey}&page=${page}&pageSize=${props.pageSize}`
    let data = await fetch(url)
    let parseddata = await data.json()
    setArticles(articles.concat(parseddata.articles))
    setTotalResults(parseddata.totalResults)

  }

    return (
      <>

        <h1 className='text-center' style={{ margin: '35px 0px', marginTop:'90px'}}>Top {props.category[0].toUpperCase() + props.category.substring(1)} Headlines</h1>
        {loading && <Spinner />}
        <InfiniteScroll
                    dataLength={articles.length}
                    next={fetchData}
                    hasMore={articles.length !== totalResults}
                    loader={<Spinner/>}
                > 
          <div className='container' >
            <div className='row'>

              {articles.map((element) => {

                return <div className='col-md-4' key={element.url}>
                  <NewsItem title={element.title ? element.title : ""} description={element.description ? element.description : ""} imageUrl={element.urlToImage} NewsUrl={element.url} author={element.author} date={element.publishedAt} source={element.source.name} />
                </div>

              })}

            </div>
          </div>
        </InfiniteScroll>

      </>
    )
            
}
 News.defaultProps = {
    country: 'in',
    pageSize: 8,
    category: 'general'
  }

  News.propTypes = {
    country: PropTypes.string,
    pageSize: PropTypes.number,
    category: PropTypes.string
  }

export default News;