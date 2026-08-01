package defpackage;

import androidx.recyclerview.widget.startapp;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9877e {
    public static startapp ad(InterfaceC8370e interfaceC8370e, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C3675e c3675e) {
        Object c12763e;
        Object c1684e;
        try {
            if ((catalog2Layout instanceof C17993e) || (catalog2Layout instanceof C4150e) || (catalog2Layout instanceof C15835e) || (catalog2Layout instanceof C13707e) || (catalog2Layout instanceof C7553e) || (catalog2Layout instanceof C17591e) || (catalog2Layout instanceof C12971e) || (catalog2Layout instanceof C6910e)) {
                c12763e = metrica(interfaceC8370e, catalog2Block, catalog2Layout, c3675e);
            } else {
                if (!(catalog2Layout instanceof C11121e) && !(catalog2Layout instanceof C17095e) && !(catalog2Layout instanceof C10113e)) {
                    int i = 1;
                    if (catalog2Block instanceof Catalog2Block.ActionsBlock) {
                        c12763e = new C18328e(new C2892e(-1025654049, true, new C17785e(catalog2Block, interfaceC8370e, 20)));
                    } else {
                        if (catalog2Block instanceof Catalog2Block.CatalogBannersBlock) {
                            i = 3;
                        } else if ((catalog2Layout instanceof C10287e) || (catalog2Layout instanceof C9277e)) {
                            i = 2;
                        }
                        c1684e = new C12952e(i, vip(interfaceC8370e, catalog2Block, catalog2Layout, c3675e));
                        c12763e = c1684e;
                    }
                }
                interfaceC8370e.appmetrica();
                c1684e = new C1684e(metrica(interfaceC8370e, catalog2Block, catalog2Layout, c3675e));
                c12763e = c1684e;
            }
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        Throwable ad = C13523e.ad(c12763e);
        if (ad != null) {
            ad.printStackTrace();
        }
        if (c12763e instanceof C12763e) {
            c12763e = null;
        }
        startapp startappVar = (startapp) c12763e;
        return startappVar == null ? new startapp() : startappVar;
    }

    public static boolean license(Catalog2Layout catalog2Layout) {
        return (catalog2Layout instanceof C10287e) || (catalog2Layout instanceof C7226e) || (catalog2Layout instanceof C17591e);
    }

    public static AbstractC5604e metrica(InterfaceC8370e interfaceC8370e, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C3675e c3675e) {
        if (catalog2Block instanceof Catalog2Block.PodcastEpisodesBlock) {
            return new C8521e(license(catalog2Layout), false);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastSliderItemsBlock) {
            return new C8390e();
        }
        if (catalog2Block instanceof Catalog2Block.LongreadsBlock) {
            return new C7350e(4);
        }
        if (catalog2Block instanceof Catalog2Block.LinksBlock) {
            return AbstractC7890e.billing(catalog2Layout, C12971e.ad) ? new C7350e(1) : (AbstractC7890e.billing(catalog2Layout, C11121e.ad) || AbstractC7890e.billing(catalog2Layout, C17095e.ad) || AbstractC7890e.billing(catalog2Layout, C10113e.ad)) ? new C7350e(3) : new C7350e(7);
        }
        if ((catalog2Block instanceof Catalog2Block.VideosBlock) || (catalog2Block instanceof Catalog2Block.ArtistVideosBlock)) {
            return new C7350e(9);
        }
        if (catalog2Block instanceof Catalog2Block.CatalogBannersBlock) {
            return ((catalog2Layout instanceof C7665e) || (catalog2Layout instanceof C6624e)) ? new AbstractC5604e() : AbstractC7890e.billing(catalog2Layout, C13707e.ad) ? new C7350e(6) : new C7350e(0);
        }
        Object obj = null;
        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
            boolean license = license(catalog2Layout);
            Catalog2Block.MusicAudiosBlock musicAudiosBlock = (Catalog2Block.MusicAudiosBlock) catalog2Block;
            List list = musicAudiosBlock.metrica;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Catalog2Button) next).ad instanceof C9945e) {
                        obj = next;
                        break;
                    }
                }
                obj = (Catalog2Button) obj;
            }
            return new C11268e(false, license, obj != null ? 5 : 4, new C17922e(musicAudiosBlock.ad, interfaceC8370e.mopub()), null, interfaceC8370e, 48);
        }
        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
            int i = license(catalog2Layout) ? 4 : 3;
            List list2 = ((Catalog2Block.MusicPlaylistsBlock) catalog2Block).metrica;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((Catalog2Button) next2).ad instanceof C5536e) {
                        obj = next2;
                        break;
                    }
                }
                obj = (Catalog2Button) obj;
            }
            return new C12678e(i, obj != null, c3675e);
        }
        if (catalog2Block instanceof Catalog2Block.SearchSuggestionsBlock) {
            return new C3884e(interfaceC8370e);
        }
        if (catalog2Block instanceof Catalog2Block.RecommendedPlaylistsBlock) {
            return new C11438e(1, c3675e);
        }
        if (catalog2Block instanceof Catalog2Block.AudioFollowingsUpdateInfoBlock) {
            return new C3739e(interfaceC8370e, catalog2Block);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastsBlock) {
            return new C16954e(1);
        }
        if (catalog2Block instanceof Catalog2Block.RadioStationsBlock) {
            return new AbstractC5604e();
        }
        if (catalog2Block instanceof Catalog2Block.AudioBooksBlock) {
            return catalog2Layout instanceof C6910e ? new C11438e(2, catalog2Block) : new AbstractC5604e();
        }
        if (catalog2Block instanceof Catalog2Block.AudioContentCardsBlock) {
            return new C7836e(new C2892e(2139735540, true, new C17630e(c3675e, interfaceC8370e, 14)));
        }
        throw new IllegalStateException("<list:bind> unknown block");
    }

    public static AbstractC5604e vip(InterfaceC8370e interfaceC8370e, Catalog2Block catalog2Block, Catalog2Layout catalog2Layout, C3675e c3675e) {
        int i = 1;
        if (catalog2Block instanceof Catalog2Block.PodcastEpisodesBlock) {
            return new C8521e(license(catalog2Layout), true);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastSliderItemsBlock) {
            return new C8390e();
        }
        if (catalog2Block instanceof Catalog2Block.LongreadsBlock) {
            return new C7350e(4);
        }
        if (catalog2Block instanceof Catalog2Block.LinksBlock) {
            return catalog2Layout instanceof C9277e ? new C7350e(7) : new C5348e(catalog2Layout instanceof C13420e);
        }
        if (catalog2Block instanceof Catalog2Block.ArtistVideosBlock) {
            return new C7350e(10);
        }
        if (catalog2Block instanceof Catalog2Block.CatalogBannersBlock) {
            return ((catalog2Layout instanceof C7665e) || (catalog2Layout instanceof C6624e)) ? new AbstractC5604e() : new C7350e(0);
        }
        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
            return new C11268e(true, license(catalog2Layout), 4, new C17922e(((Catalog2Block.MusicAudiosBlock) catalog2Block).ad, interfaceC8370e.mopub()), null, interfaceC8370e, 48);
        }
        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
            if (AbstractC7890e.billing(catalog2Layout, C1693e.ad)) {
                return new C11001e();
            }
            if (license(catalog2Layout)) {
                i = 5;
            } else if (catalog2Layout instanceof C1824e) {
                i = 6;
            }
            return new C12678e(i, false, c3675e);
        }
        if (catalog2Block instanceof Catalog2Block.SearchSuggestionsBlock) {
            return new AbstractC5604e();
        }
        if (catalog2Block instanceof Catalog2Block.VideosBlock) {
            return new C7350e(10);
        }
        if (catalog2Block instanceof Catalog2Block.RecommendedPlaylistsBlock) {
            return new C11438e(0, c3675e);
        }
        if (catalog2Block instanceof Catalog2Block.AudioFollowingsUpdateInfoBlock) {
            return new C3739e(interfaceC8370e, catalog2Block);
        }
        if (catalog2Block instanceof Catalog2Block.PodcastsBlock) {
            return new C0722e(catalog2Layout instanceof C1824e);
        }
        if (!(catalog2Block instanceof Catalog2Block.RadioStationsBlock) && !(catalog2Block instanceof Catalog2Block.AudioBooksBlock)) {
            throw new IllegalStateException("<slider:bind> unknown block");
        }
        return new AbstractC5604e();
    }
}
