/* eslint-disable react/prop-types */
import { Component } from "react";

export class Button extends Component {
    render() {
        const { children, onClick, disabled } = this.props
        
        return (
            <button 
            className="bg-green-500 disabled:bg-slate-400 disabled:cursor-not-allowed w-full rounded-full py-2 px-3 font-semibold" 
            onClick={onClick}
            disabled={disabled}
            >
                {children}
            </button>
        )
    }
}