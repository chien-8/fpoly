export interface IVideo{
    id: number;
    name: string, maxLength: 255, minLength: 6;
    image: string;
    url: string;
    description: string;
    view_number: number;
}