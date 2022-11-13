import React from 'react'

export default NewsItem = (props) => {

    let { title, description, imageUrl, NewsUrl, author, date, source } = props;
    return (
      <div className="my-3">
        <div className="card">
          
          <div className="card-body">
          <div style={{display:'flex', justifyContent:'flex-end', position:'absolute', left:50}}>
            <span className="position-absolute top-0 translate-middle badge rounded-pill bg-danger" style={{ left:'90%'}}>{source}</span>
          </div>
            
<img src={imageUrl ? imageUrl : 'https://a4.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1219926_1296x729.jpg'}
            className="card-img-top" alt="..." />
            <h5 className="card-title">{title}...</h5>
            <p className="card-text">{description}...</p>
            <p className='card-text'><small className='text-muted'>By {author ? author : "Unknown"} on {new Date(date).toGMTString()}</small></p>
            <a href={NewsUrl} rel="noreferrer" target="_blank" className="btn btn-sm btn-primary">Read More</a>
          </div>
        </div>
      </div>

    )
}
