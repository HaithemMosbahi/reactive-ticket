import { NgTicketsPage } from './app.po';

describe('ng-tickets App', () => {
  let page: NgTicketsPage;

  beforeEach(() => {
    page = new NgTicketsPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
