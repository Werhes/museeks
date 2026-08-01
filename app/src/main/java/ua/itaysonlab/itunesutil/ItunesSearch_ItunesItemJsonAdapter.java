package ua.itaysonlab.itunesutil;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItunesSearch_ItunesItemJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("kind", "artistName", "trackName", "collectionName", "artworkUrl100", "trackId", "releaseDate", "discCount", "discNumber", "trackCount", "trackNumber", "primaryGenreName");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public ItunesSearch_ItunesItemJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "kind");
        this.metrica = c14172e.vip(String.class, c3295e, "collectionName");
        this.license = c14172e.vip(Integer.class, c3295e, "trackId");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        ItunesSearch$ItunesItem itunesSearch$ItunesItem = (ItunesSearch$ItunesItem) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("kind");
        String str = itunesSearch$ItunesItem.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("artistName");
        abstractC13345e.purchase(abstractC3442e, itunesSearch$ItunesItem.vip);
        abstractC3442e.loadAd("trackName");
        abstractC13345e.purchase(abstractC3442e, itunesSearch$ItunesItem.metrica);
        abstractC3442e.loadAd("collectionName");
        this.metrica.purchase(abstractC3442e, itunesSearch$ItunesItem.license);
        abstractC3442e.loadAd("artworkUrl100");
        abstractC13345e.purchase(abstractC3442e, itunesSearch$ItunesItem.appmetrica);
        abstractC3442e.loadAd("trackId");
        Integer num = itunesSearch$ItunesItem.purchase;
        AbstractC13345e abstractC13345e2 = this.license;
        abstractC13345e2.purchase(abstractC3442e, num);
        abstractC3442e.loadAd("releaseDate");
        abstractC13345e.purchase(abstractC3442e, itunesSearch$ItunesItem.billing);
        abstractC3442e.loadAd("discCount");
        abstractC13345e2.purchase(abstractC3442e, itunesSearch$ItunesItem.yandex);
        abstractC3442e.loadAd("discNumber");
        abstractC13345e2.purchase(abstractC3442e, itunesSearch$ItunesItem.startapp);
        abstractC3442e.loadAd("trackCount");
        abstractC13345e2.purchase(abstractC3442e, itunesSearch$ItunesItem.adcel);
        abstractC3442e.loadAd("trackNumber");
        abstractC13345e2.purchase(abstractC3442e, itunesSearch$ItunesItem.mopub);
        abstractC3442e.loadAd("primaryGenreName");
        abstractC13345e.purchase(abstractC3442e, itunesSearch$ItunesItem.advert);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ItunesSearch.ItunesItem)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        ?? r3 = 0;
        Object obj9 = null;
        while (abstractC17080e.Signature()) {
            String str3 = str;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            Object obj10 = r3;
            AbstractC13345e abstractC13345e2 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    str = str3;
                    r3 = obj10;
                    break;
                case 0:
                    i &= -2;
                    str = abstractC13345e2.vip(abstractC17080e);
                    r3 = obj10;
                    break;
                case 1:
                    r3 = abstractC13345e2.vip(abstractC17080e);
                    i &= -3;
                    str = str3;
                    break;
                case 2:
                    obj9 = abstractC13345e2.vip(abstractC17080e);
                    i &= -5;
                    str = str3;
                    r3 = obj10;
                    break;
                case 3:
                    ?? vip = this.metrica.vip(abstractC17080e);
                    if (vip == 0) {
                        set = AbstractC0869e.subs("collectionName", "collectionName", abstractC17080e, set);
                    } else {
                        str2 = vip;
                    }
                    i &= -9;
                    str = str3;
                    r3 = obj10;
                    break;
                case 4:
                    obj = abstractC13345e2.vip(abstractC17080e);
                    i &= -17;
                    str = str3;
                    r3 = obj10;
                    break;
                case 5:
                    obj2 = abstractC13345e.vip(abstractC17080e);
                    i &= -33;
                    str = str3;
                    r3 = obj10;
                    break;
                case 6:
                    obj3 = abstractC13345e2.vip(abstractC17080e);
                    i &= -65;
                    str = str3;
                    r3 = obj10;
                    break;
                case 7:
                    obj4 = abstractC13345e.vip(abstractC17080e);
                    i &= -129;
                    str = str3;
                    r3 = obj10;
                    break;
                case 8:
                    obj5 = abstractC13345e.vip(abstractC17080e);
                    i &= -257;
                    str = str3;
                    r3 = obj10;
                    break;
                case 9:
                    obj6 = abstractC13345e.vip(abstractC17080e);
                    i &= -513;
                    str = str3;
                    r3 = obj10;
                    break;
                case 10:
                    obj7 = abstractC13345e.vip(abstractC17080e);
                    i &= -1025;
                    str = str3;
                    r3 = obj10;
                    break;
                case 11:
                    obj8 = abstractC13345e2.vip(abstractC17080e);
                    i &= -2049;
                    str = str3;
                    r3 = obj10;
                    break;
                default:
                    str = str3;
                    r3 = obj10;
                    break;
            }
        }
        String str4 = str;
        String str5 = r3;
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -4096) {
            return new ItunesSearch$ItunesItem(str4, str5, (String) obj9, str2, (String) obj, (Integer) obj2, (String) obj3, (Integer) obj4, (Integer) obj5, (Integer) obj6, (Integer) obj7, (String) obj8);
        }
        return new ItunesSearch$ItunesItem(str4, str5, (String) obj9, str2, (String) obj, (Integer) obj2, (String) obj3, (Integer) obj4, (Integer) obj5, (Integer) obj6, (Integer) obj7, (String) obj8, i);
    }
}
