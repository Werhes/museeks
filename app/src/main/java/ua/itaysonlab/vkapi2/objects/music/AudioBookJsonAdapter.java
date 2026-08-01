package ua.itaysonlab.vkapi2.objects.music;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC1815e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C13664e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioBookJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "publisher", "narrators", "translators", "genres", "authors", "code", "title", "duration", "minimum_age", "is_explicit", "in_favorites", "progress_percentage", "release_date", "copyright", "access_status", "cover", "chapters", "track_code");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public AudioBookJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(AudioBook.Link.class, c3295e, "publisher");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, AudioBook.Link.class), c3295e, "narrators");
        this.appmetrica = c14172e.vip(String.class, c3295e, "code");
        this.purchase = c14172e.vip(Boolean.TYPE, c3295e, "is_explicit");
        this.billing = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "cover");
        this.yandex = c14172e.vip(AbstractC18453e.purchase(List.class, AudioBook.Chapter.class), c3295e, "chapters");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioBook audioBook = (AudioBook) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        int i = audioBook.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "publisher");
        this.metrica.purchase(abstractC3442e, audioBook.vip);
        abstractC3442e.loadAd("narrators");
        List list = audioBook.metrica;
        AbstractC13345e abstractC13345e2 = this.license;
        abstractC13345e2.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("translators");
        abstractC13345e2.purchase(abstractC3442e, audioBook.license);
        abstractC3442e.loadAd("genres");
        abstractC13345e2.purchase(abstractC3442e, audioBook.appmetrica);
        abstractC3442e.loadAd("authors");
        abstractC13345e2.purchase(abstractC3442e, audioBook.purchase);
        abstractC3442e.loadAd("code");
        String str = audioBook.billing;
        AbstractC13345e abstractC13345e3 = this.appmetrica;
        abstractC13345e3.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        abstractC13345e3.purchase(abstractC3442e, audioBook.yandex);
        abstractC3442e.loadAd("duration");
        AbstractC8647e.subs(audioBook.startapp, abstractC13345e, abstractC3442e, "minimum_age");
        AbstractC8647e.subs(audioBook.adcel, abstractC13345e, abstractC3442e, "is_explicit");
        boolean z = audioBook.mopub;
        AbstractC13345e abstractC13345e4 = this.purchase;
        AbstractC8647e.m2459native(z, abstractC13345e4, abstractC3442e, "in_favorites");
        AbstractC8647e.m2459native(audioBook.advert, abstractC13345e4, abstractC3442e, "progress_percentage");
        AbstractC8647e.subs(audioBook.smaato, abstractC13345e, abstractC3442e, "release_date");
        AbstractC8647e.subs(audioBook.amazon, abstractC13345e, abstractC3442e, "copyright");
        abstractC13345e3.purchase(abstractC3442e, audioBook.loadAd);
        abstractC3442e.loadAd("access_status");
        abstractC13345e3.purchase(abstractC3442e, audioBook.Signature);
        abstractC3442e.loadAd("cover");
        this.billing.purchase(abstractC3442e, audioBook.admob);
        abstractC3442e.loadAd("chapters");
        this.yandex.purchase(abstractC3442e, audioBook.subscription);
        abstractC3442e.loadAd("track_code");
        abstractC13345e3.purchase(abstractC3442e, audioBook.remoteconfig);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBook)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0059. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        List list;
        boolean z;
        String str;
        String str2;
        boolean z2;
        AudioBook.Link link;
        int i;
        abstractC17080e.license();
        Integer num = null;
        AudioBook.Link link2 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        String str3 = null;
        Set set = C3295e.f7451e;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        int i6 = 0;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            Integer num2 = num;
            Object obj11 = obj9;
            Object obj12 = obj10;
            if (!abstractC17080e.Signature()) {
                AudioBook.Link link3 = link2;
                Object obj13 = obj;
                Object obj14 = obj2;
                Object obj15 = obj3;
                abstractC17080e.advert();
                if ((!z3) & (num2 == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if ((!z4) & (link3 == null)) {
                    set = AbstractC0869e.isPro("publisher", "publisher", abstractC17080e, set);
                }
                if ((!z5) & (str3 == null)) {
                    set = AbstractC0869e.isPro("track_code", "track_code", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i2 == -262141) {
                    return new AudioBook(num2.intValue(), link3, (List) obj11, (List) obj12, (List) obj13, (List) obj14, (String) obj15, (String) obj4, i3, i4, z6, z7, i5, i6, (String) obj5, (String) obj6, (List) obj7, (List) obj8, str3);
                }
                Object obj16 = obj4;
                Object obj17 = obj5;
                Object obj18 = obj7;
                Object obj19 = obj8;
                int i7 = i3;
                int i8 = i4;
                int i9 = i6;
                int intValue = num2.intValue();
                List list2 = (List) obj11;
                List list3 = (List) obj12;
                List list4 = (List) obj13;
                List list5 = (List) obj14;
                String str4 = (String) obj15;
                String str5 = (String) obj16;
                String str6 = (String) obj17;
                String str7 = (String) obj6;
                List list6 = (List) obj18;
                List list7 = (List) obj19;
                int i10 = i2 & 4;
                C13664e c13664e = C13664e.f27089e;
                if (i10 != 0) {
                    list2 = c13664e;
                }
                if ((i2 & 8) != 0) {
                    list3 = c13664e;
                }
                if ((i2 & 16) != 0) {
                    list4 = c13664e;
                }
                if ((i2 & 32) != 0) {
                    list5 = c13664e;
                }
                int i11 = i2 & 64;
                String str8 = BuildConfig.FLAVOR;
                if (i11 != 0) {
                    str4 = BuildConfig.FLAVOR;
                }
                if ((i2 & 128) != 0) {
                    str5 = BuildConfig.FLAVOR;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i7 = 0;
                }
                if ((i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    i8 = 0;
                }
                if ((i2 & 1024) != 0) {
                    z6 = false;
                }
                if ((i2 & 2048) != 0) {
                    z7 = false;
                }
                int i12 = (i2 & 4096) != 0 ? 0 : i5;
                if ((i2 & 8192) != 0) {
                    i9 = 0;
                }
                if ((i2 & 16384) != 0) {
                    str6 = BuildConfig.FLAVOR;
                }
                if ((32768 & i2) == 0) {
                    str8 = str7;
                }
                List list8 = (65536 & i2) != 0 ? c13664e : list6;
                if ((131072 & i2) != 0) {
                    z = z6;
                    list = c13664e;
                    str2 = str5;
                    z2 = z7;
                    link = link3;
                    str = str6;
                } else {
                    boolean z8 = z6;
                    list = list7;
                    z = z8;
                    str = str6;
                    str2 = str5;
                    z2 = z7;
                    link = link3;
                }
                return new AudioBook(intValue, link, list2, list3, list4, list5, str4, str2, i7, i8, z, z2, i12, i9, str, str8, list8, list, str3);
            }
            AudioBook.Link link4 = link2;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.purchase;
            Object obj20 = obj;
            AbstractC13345e abstractC13345e2 = this.license;
            Object obj21 = obj2;
            AbstractC13345e abstractC13345e3 = this.vip;
            Object obj22 = obj3;
            AbstractC13345e abstractC13345e4 = this.appmetrica;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 0:
                    Object vip = abstractC13345e3.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        link2 = link4;
                        num = num2;
                        obj9 = obj11;
                        obj10 = obj12;
                        z3 = true;
                        obj = obj20;
                        obj2 = obj21;
                        obj3 = obj22;
                        break;
                    } else {
                        num = (Integer) vip;
                        link2 = link4;
                        obj9 = obj11;
                        obj10 = obj12;
                        obj = obj20;
                        obj2 = obj21;
                        obj3 = obj22;
                    }
                case 1:
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("publisher", "publisher", abstractC17080e, set);
                        link2 = link4;
                        num = num2;
                        obj9 = obj11;
                        obj10 = obj12;
                        z4 = true;
                        obj = obj20;
                        obj2 = obj21;
                        obj3 = obj22;
                        break;
                    } else {
                        link2 = (AudioBook.Link) vip2;
                        num = num2;
                        obj9 = obj11;
                        obj10 = obj12;
                        obj = obj20;
                        obj2 = obj21;
                        obj3 = obj22;
                    }
                case 2:
                    Object vip3 = abstractC13345e2.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("narrators", "narrators", abstractC17080e, set);
                        obj9 = obj11;
                    } else {
                        obj9 = vip3;
                    }
                    i2 &= -5;
                    link2 = link4;
                    num = num2;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 3:
                    Object vip4 = abstractC13345e2.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("translators", "translators", abstractC17080e, set);
                        obj10 = obj12;
                    } else {
                        obj10 = vip4;
                    }
                    i2 &= -9;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 4:
                    Object vip5 = abstractC13345e2.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("genres", "genres", abstractC17080e, set);
                        obj = obj20;
                    } else {
                        obj = vip5;
                    }
                    i2 &= -17;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 5:
                    Object vip6 = abstractC13345e2.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("authors", "authors", abstractC17080e, set);
                        obj2 = obj21;
                    } else {
                        obj2 = vip6;
                    }
                    i2 &= -33;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj3 = obj22;
                    break;
                case 6:
                    Object vip7 = abstractC13345e4.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("code", "code", abstractC17080e, set);
                        obj3 = obj22;
                    } else {
                        obj3 = vip7;
                    }
                    i2 &= -65;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    break;
                case 7:
                    Object vip8 = abstractC13345e4.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                    } else {
                        obj4 = vip8;
                    }
                    i2 &= -129;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 8:
                    Object vip9 = abstractC13345e3.vip(abstractC17080e);
                    if (vip9 == null) {
                        set = AbstractC0869e.subs("duration", "duration", abstractC17080e, set);
                    } else {
                        i3 = ((Number) vip9).intValue();
                    }
                    i2 &= -257;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 9:
                    Object vip10 = abstractC13345e3.vip(abstractC17080e);
                    if (vip10 == null) {
                        set = AbstractC0869e.subs("minimum_age", "minimum_age", abstractC17080e, set);
                    } else {
                        i4 = ((Number) vip10).intValue();
                    }
                    i2 &= -513;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 10:
                    Object vip11 = abstractC13345e.vip(abstractC17080e);
                    if (vip11 == null) {
                        set = AbstractC0869e.subs("is_explicit", "is_explicit", abstractC17080e, set);
                    } else {
                        z6 = ((Boolean) vip11).booleanValue();
                    }
                    i2 &= -1025;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 11:
                    Object vip12 = abstractC13345e.vip(abstractC17080e);
                    if (vip12 == null) {
                        set = AbstractC0869e.subs("in_favorites", "in_favorites", abstractC17080e, set);
                    } else {
                        z7 = ((Boolean) vip12).booleanValue();
                    }
                    i2 &= -2049;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 12:
                    Object vip13 = abstractC13345e3.vip(abstractC17080e);
                    if (vip13 == null) {
                        set = AbstractC0869e.subs("progress_percentage", "progress_percentage", abstractC17080e, set);
                    } else {
                        i5 = ((Number) vip13).intValue();
                    }
                    i2 &= -4097;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 13:
                    Object vip14 = abstractC13345e3.vip(abstractC17080e);
                    if (vip14 == null) {
                        set = AbstractC0869e.subs("release_date", "release_date", abstractC17080e, set);
                    } else {
                        i6 = ((Number) vip14).intValue();
                    }
                    i2 &= -8193;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 14:
                    Object vip15 = abstractC13345e4.vip(abstractC17080e);
                    if (vip15 == null) {
                        set = AbstractC0869e.subs("copyright", "copyright", abstractC17080e, set);
                    } else {
                        obj5 = vip15;
                    }
                    i2 &= -16385;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 15:
                    Object vip16 = abstractC13345e4.vip(abstractC17080e);
                    if (vip16 == null) {
                        set = AbstractC0869e.subs("access_status", "access_status", abstractC17080e, set);
                    } else {
                        obj6 = vip16;
                    }
                    i = -32769;
                    i2 &= i;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case 16:
                    Object vip17 = this.billing.vip(abstractC17080e);
                    if (vip17 == null) {
                        set = AbstractC0869e.subs("cover", "cover", abstractC17080e, set);
                    } else {
                        obj7 = vip17;
                    }
                    i = -65537;
                    i2 &= i;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object vip18 = this.yandex.vip(abstractC17080e);
                    if (vip18 == null) {
                        set = AbstractC0869e.subs("chapters", "chapters", abstractC17080e, set);
                    } else {
                        obj8 = vip18;
                    }
                    i = -131073;
                    i2 &= i;
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    Object vip19 = abstractC13345e4.vip(abstractC17080e);
                    if (vip19 == null) {
                        set = AbstractC0869e.subs("track_code", "track_code", abstractC17080e, set);
                        link2 = link4;
                        num = num2;
                        obj9 = obj11;
                        obj10 = obj12;
                        z5 = true;
                        obj = obj20;
                        obj2 = obj21;
                        obj3 = obj22;
                        break;
                    } else {
                        str3 = (String) vip19;
                        link2 = link4;
                        num = num2;
                        obj9 = obj11;
                        obj10 = obj12;
                        obj = obj20;
                        obj2 = obj21;
                        obj3 = obj22;
                    }
                default:
                    link2 = link4;
                    num = num2;
                    obj9 = obj11;
                    obj10 = obj12;
                    obj = obj20;
                    obj2 = obj21;
                    obj3 = obj22;
                    break;
            }
        }
    }
}
