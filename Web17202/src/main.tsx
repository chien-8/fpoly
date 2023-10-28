import React from 'react'
import ReactDOM from 'react-dom/client'
import { Provider } from 'react-redux'
import App from './App'
// import './index.css' 
import { store } from './store/silce'
import { BrowserRouter } from 'react-router-dom'
import 'antd/dist/reset.css';



ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <BrowserRouter>
    <Provider store={store}> 
      <App />
    </Provider>
    
  </BrowserRouter>

)
