import React, { Component } from 'react'
import NewsItem from './NewsItem'
import Spinner from './Spinner';
import PropTypes from 'prop-types'

export class News extends Component {

  static defaultProps = {
    country:'in',
    pageSize:8
  }

  static propTypes = {
    country: PropTypes.string,
    pageSize: PropTypes.number
  }

  constructor() {
    super();
    console.log("Hello I am a constructor from news component")
    this.state = {
      articles: [],
      loading: false,
      page: 1
    }
  }

  async componentDidMount() {
    console.log("cdm");
    let url = `https://newsapi.org/v2/top-headlines?country=${this.props.country}&category=${this.props.category}&apiKey=59d9bf1539e24d8494eda717ce24c7d0&page=1&pageSize=${this.props.pageSize}`;
    this.setState({loading: true})
    let data = await fetch(url);
    let parseddata = await data.json();
    console.log(parseddata);
    this.setState({ articles: parseddata.articles, totalResults: parseddata.totalResults, loading: false });

  }

  handlePrevClick = async () => {

    let url = `https://newsapi.org/v2/top-headlines?country=${this.props.country}&category=${this.props.category}&apiKey=59d9bf1539e24d8494eda717ce24c7d0&page=${this.state.page - 1}&pageSize${this.props.pageSize}`;
    this.setState({loading: true})
    let data = await fetch(url);
    let parseddata = await data.json();
    console.log(parseddata);
    this.setState({ page: this.state.page - 1, articles: parseddata.articles, loading: false });

  }

  handleNextClick = async () => {

    if (!(this.state.page + 1 > Math.ceil(this.state.totalResults / this.props.pageSize))) {

      this.setState({loading: true})
      let url = `https://newsapi.org/v2/top-headlines?country=${this.props.country}&category=${this.props.category}&apiKey=59d9bf1539e24d8494eda717ce24c7d0&page=${this.state.page + 1}&pageSize=${this.props.pageSize}`;
      let data = await fetch(url);
      let parseddata = await data.json();
      console.log(parseddata);
      this.setState({ page: this.state.page + 1, articles: parseddata.articles, loading: false });
    }

  }


  render() {
    return (

      <div className='container my-3' >
        <h1 className='text-center'>Top Headlines</h1>
        
        {this.state.loading && <Spinner/>}
        
        <div className='row'>

          {!this.state.loading && this.state.articles.map((element) => {

            return <div className='col-md-4' key={element.url}>
              <NewsItem title={element.title ? element.title.slice(0, 45) : ""} description={element.description ? element.description.slice(0, 88) : ""}
                imageUrl={element.urlToImage} NewsUrl={element.url} author={element.author} date={element.publishedAt}/>
            </div>

          })}

        </div>
        <div className='container d-flex justify-content-between'>
          <button type="button" disabled={this.state.page <= 1} onClick={this.handlePrevClick} className="btn btn-secondary">&larr; Back</button>
          <button type="button" disabled={this.state.page + 1 > Math.ceil(this.state.totalResults / this.props.pageSize)} onClick={this.handleNextClick} className="btn btn-secondary">Next &rarr;</button>
        </div>
      </div>
    )
  }
}

export default News