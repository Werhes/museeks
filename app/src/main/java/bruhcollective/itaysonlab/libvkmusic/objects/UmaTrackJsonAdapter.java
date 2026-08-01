package bruhcollective.itaysonlab.libvkmusic.objects;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UmaTrackJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("apiId", "name", "artistDisplayName", "cover", "file", "album", "artist", "artists", "isLegal", "isRadioCapable", "isAdded", "isLiked", "isDisliked", "isRestricted", "isExplicit", "shareHash", "duration", "size", "permissions", "vkAudioId", "liked", "disliked");
    public final AbstractC13345e adcel;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e mopub;
    public final AbstractC13345e purchase;
    public final AbstractC13345e startapp;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public UmaTrackJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "apiId");
        this.metrica = c14172e.vip(UmaCover.class, c3295e, "cover");
        this.license = c14172e.vip(UmaAlbum.class, c3295e, "album");
        this.appmetrica = c14172e.vip(UmaArtist.class, c3295e, "artist");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, UmaArtist.class), c3295e, "artists");
        this.billing = c14172e.vip(Boolean.TYPE, c3295e, "isLegal");
        this.yandex = c14172e.vip(Integer.TYPE, c3295e, "duration");
        this.startapp = c14172e.vip(Long.TYPE, c3295e, "size");
        this.adcel = c14172e.vip(UmaPermissions.class, c3295e, "permissions");
        this.mopub = c14172e.vip(String.class, c3295e, "vkAudioId");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UmaTrack umaTrack = (UmaTrack) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("apiId");
        String str = umaTrack.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("name");
        abstractC13345e.purchase(abstractC3442e, umaTrack.vip);
        abstractC3442e.loadAd("artistDisplayName");
        abstractC13345e.purchase(abstractC3442e, umaTrack.metrica);
        abstractC3442e.loadAd("cover");
        this.metrica.purchase(abstractC3442e, umaTrack.license);
        abstractC3442e.loadAd("file");
        abstractC13345e.purchase(abstractC3442e, umaTrack.appmetrica);
        abstractC3442e.loadAd("album");
        this.license.purchase(abstractC3442e, umaTrack.purchase);
        abstractC3442e.loadAd("artist");
        this.appmetrica.purchase(abstractC3442e, umaTrack.billing);
        abstractC3442e.loadAd("artists");
        this.purchase.purchase(abstractC3442e, umaTrack.yandex);
        abstractC3442e.loadAd("isLegal");
        boolean z = umaTrack.startapp;
        AbstractC13345e abstractC13345e2 = this.billing;
        AbstractC8647e.m2459native(z, abstractC13345e2, abstractC3442e, "isRadioCapable");
        AbstractC8647e.m2459native(umaTrack.adcel, abstractC13345e2, abstractC3442e, "isAdded");
        AbstractC8647e.m2459native(umaTrack.mopub, abstractC13345e2, abstractC3442e, "isLiked");
        AbstractC8647e.m2459native(umaTrack.advert, abstractC13345e2, abstractC3442e, "isDisliked");
        AbstractC8647e.m2459native(umaTrack.smaato, abstractC13345e2, abstractC3442e, "isRestricted");
        AbstractC8647e.m2459native(umaTrack.amazon, abstractC13345e2, abstractC3442e, "isExplicit");
        AbstractC8647e.m2459native(umaTrack.loadAd, abstractC13345e2, abstractC3442e, "shareHash");
        abstractC13345e.purchase(abstractC3442e, umaTrack.Signature);
        abstractC3442e.loadAd("duration");
        AbstractC8647e.subs(umaTrack.admob, this.yandex, abstractC3442e, "size");
        AbstractC8647e.crashlytics(umaTrack.subscription, this.startapp, abstractC3442e, "permissions");
        this.adcel.purchase(abstractC3442e, umaTrack.remoteconfig);
        abstractC3442e.loadAd("vkAudioId");
        this.mopub.purchase(abstractC3442e, umaTrack.pro);
        abstractC3442e.loadAd("liked");
        AbstractC8647e.m2459native(umaTrack.advert, abstractC13345e2, abstractC3442e, "disliked");
        abstractC13345e2.purchase(abstractC3442e, Boolean.valueOf(umaTrack.smaato));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaTrack)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x00a4. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        UmaTrack umaTrack;
        String str;
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        char c = 65535;
        boolean z = false;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        boolean z3 = false;
        String str4 = null;
        boolean z4 = false;
        UmaCover umaCover = null;
        boolean z5 = false;
        String str5 = null;
        boolean z6 = false;
        Boolean bool = null;
        boolean z7 = false;
        Boolean bool2 = null;
        boolean z8 = false;
        Boolean bool3 = null;
        boolean z9 = false;
        Boolean bool4 = null;
        boolean z10 = false;
        Boolean bool5 = null;
        boolean z11 = false;
        Boolean bool6 = null;
        boolean z12 = false;
        Boolean bool7 = null;
        boolean z13 = false;
        String str6 = null;
        boolean z14 = false;
        Integer num = null;
        boolean z15 = false;
        Long l = null;
        boolean z16 = false;
        UmaPermissions umaPermissions = null;
        UmaAlbum umaAlbum = null;
        UmaArtist umaArtist = null;
        List list = null;
        Object obj = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        while (true) {
            boolean z17 = z;
            boolean z18 = z2;
            String str7 = str2;
            String str8 = str3;
            boolean z19 = z3;
            String str9 = str4;
            boolean z20 = z4;
            UmaCover umaCover2 = umaCover;
            boolean z21 = z5;
            String str10 = str5;
            char c2 = c;
            if (!abstractC17080e.Signature()) {
                abstractC17080e.advert();
                if ((!z17) & (str7 == null)) {
                    set = AbstractC0869e.isPro("apiId", "apiId", abstractC17080e, set);
                }
                if ((!z18) & (str8 == null)) {
                    set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
                }
                if ((!z19) & (str9 == null)) {
                    set = AbstractC0869e.isPro("artistDisplayName", "artistDisplayName", abstractC17080e, set);
                }
                if ((!z20) & (umaCover2 == null)) {
                    set = AbstractC0869e.isPro("cover", "cover", abstractC17080e, set);
                }
                if ((!z21) & (str10 == null)) {
                    set = AbstractC0869e.isPro("file_", "file", abstractC17080e, set);
                }
                if ((!z6) & (bool == null)) {
                    set = AbstractC0869e.isPro("isLegal", "isLegal", abstractC17080e, set);
                }
                if ((!z7) & (bool2 == null)) {
                    set = AbstractC0869e.isPro("isRadioCapable", "isRadioCapable", abstractC17080e, set);
                }
                if ((!z8) & (bool3 == null)) {
                    set = AbstractC0869e.isPro("isAdded", "isAdded", abstractC17080e, set);
                }
                if ((!z9) & (bool4 == null)) {
                    set = AbstractC0869e.isPro("isLiked", "isLiked", abstractC17080e, set);
                }
                if ((!z10) & (bool5 == null)) {
                    set = AbstractC0869e.isPro("isDisliked", "isDisliked", abstractC17080e, set);
                }
                if ((!z11) & (bool6 == null)) {
                    set = AbstractC0869e.isPro("isRestricted", "isRestricted", abstractC17080e, set);
                }
                if ((!z12) & (bool7 == null)) {
                    set = AbstractC0869e.isPro("isExplicit", "isExplicit", abstractC17080e, set);
                }
                if ((!z13) & (str6 == null)) {
                    set = AbstractC0869e.isPro("shareHash", "shareHash", abstractC17080e, set);
                }
                if ((!z14) & (num == null)) {
                    set = AbstractC0869e.isPro("duration", "duration", abstractC17080e, set);
                }
                if ((!z15) & (l == null)) {
                    set = AbstractC0869e.isPro("size", "size", abstractC17080e, set);
                }
                if ((!z16) & (umaPermissions == null)) {
                    set = AbstractC0869e.isPro("permissions", "permissions", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (c2 == 65535) {
                    umaTrack = new UmaTrack(str7, str8, str9, umaCover2, str10, umaAlbum, umaArtist, list, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), str6, num.intValue(), l.longValue(), umaPermissions, (String) obj);
                } else {
                    umaTrack = new UmaTrack(str7, str8, str9, umaCover2, str10, umaAlbum, umaArtist, list, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), str6, num.intValue(), l.longValue(), umaPermissions, (0 & c2) != 0 ? null : (String) obj);
                }
                if (bool8 != null) {
                    umaTrack.metrica(bool8.booleanValue());
                }
                if (bool9 != null) {
                    umaTrack.startapp(bool9.booleanValue());
                }
                return umaTrack;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            AbstractC13345e abstractC13345e2 = this.billing;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("apiId", "apiId", abstractC17080e, set);
                        str2 = str7;
                        z = true;
                    } else {
                        str2 = (String) vip;
                        z = z17;
                    }
                    z2 = z18;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                        str3 = str8;
                        z2 = true;
                    } else {
                        str3 = (String) vip2;
                        z2 = z18;
                    }
                    z = z17;
                    str2 = str7;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("artistDisplayName", "artistDisplayName", abstractC17080e, set);
                        str4 = str9;
                        z3 = true;
                    } else {
                        str4 = (String) vip3;
                        z3 = z19;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 3:
                    Object vip4 = this.metrica.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("cover", "cover", abstractC17080e, set);
                        umaCover = umaCover2;
                        z4 = true;
                    } else {
                        umaCover = (UmaCover) vip4;
                        z4 = z20;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 4:
                    Object vip5 = abstractC13345e.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("file_", "file", abstractC17080e, set);
                        str5 = str10;
                        z5 = true;
                    } else {
                        str5 = (String) vip5;
                        z5 = z21;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    c = c2;
                    break;
                case 5:
                    umaAlbum = (UmaAlbum) this.license.vip(abstractC17080e);
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 6:
                    umaArtist = (UmaArtist) this.appmetrica.vip(abstractC17080e);
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 7:
                    list = (List) this.purchase.vip(abstractC17080e);
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 8:
                    Object vip6 = abstractC13345e2.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("isLegal", "isLegal", abstractC17080e, set);
                        z6 = true;
                    } else {
                        bool = (Boolean) vip6;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 9:
                    Object vip7 = abstractC13345e2.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("isRadioCapable", "isRadioCapable", abstractC17080e, set);
                        z7 = true;
                    } else {
                        bool2 = (Boolean) vip7;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 10:
                    Object vip8 = abstractC13345e2.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("isAdded", "isAdded", abstractC17080e, set);
                        z8 = true;
                    } else {
                        bool3 = (Boolean) vip8;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 11:
                    Object vip9 = abstractC13345e2.vip(abstractC17080e);
                    if (vip9 == null) {
                        set = AbstractC0869e.subs("isLiked", "isLiked", abstractC17080e, set);
                        z9 = true;
                    } else {
                        bool4 = (Boolean) vip9;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 12:
                    Object vip10 = abstractC13345e2.vip(abstractC17080e);
                    if (vip10 == null) {
                        set = AbstractC0869e.subs("isDisliked", "isDisliked", abstractC17080e, set);
                        z10 = true;
                    } else {
                        bool5 = (Boolean) vip10;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 13:
                    Object vip11 = abstractC13345e2.vip(abstractC17080e);
                    if (vip11 == null) {
                        set = AbstractC0869e.subs("isRestricted", "isRestricted", abstractC17080e, set);
                        z11 = true;
                    } else {
                        bool6 = (Boolean) vip11;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 14:
                    Object vip12 = abstractC13345e2.vip(abstractC17080e);
                    if (vip12 == null) {
                        set = AbstractC0869e.subs("isExplicit", "isExplicit", abstractC17080e, set);
                        z12 = true;
                    } else {
                        bool7 = (Boolean) vip12;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 15:
                    Object vip13 = abstractC13345e.vip(abstractC17080e);
                    if (vip13 == null) {
                        set = AbstractC0869e.subs("shareHash", "shareHash", abstractC17080e, set);
                        z13 = true;
                    } else {
                        str6 = (String) vip13;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case 16:
                    Object vip14 = this.yandex.vip(abstractC17080e);
                    if (vip14 == null) {
                        set = AbstractC0869e.subs("duration", "duration", abstractC17080e, set);
                        z14 = true;
                    } else {
                        num = (Integer) vip14;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object vip15 = this.startapp.vip(abstractC17080e);
                    if (vip15 == null) {
                        set = AbstractC0869e.subs("size", "size", abstractC17080e, set);
                        z15 = true;
                    } else {
                        l = (Long) vip15;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    Object vip16 = this.adcel.vip(abstractC17080e);
                    if (vip16 == null) {
                        set = AbstractC0869e.subs("permissions", "permissions", abstractC17080e, set);
                        z16 = true;
                    } else {
                        umaPermissions = (UmaPermissions) vip16;
                    }
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    obj = this.mopub.vip(abstractC17080e);
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = 65535;
                    break;
                case 20:
                    Object vip17 = abstractC13345e2.vip(abstractC17080e);
                    if (vip17 == null) {
                        str = "liked";
                        set = AbstractC0869e.subs(str, str, abstractC17080e, set);
                        z = z17;
                        z2 = z18;
                        str2 = str7;
                        str3 = str8;
                        z3 = z19;
                        str4 = str9;
                        z4 = z20;
                        umaCover = umaCover2;
                        z5 = z21;
                        str5 = str10;
                        c = c2;
                        break;
                    } else {
                        bool8 = (Boolean) vip17;
                        z = z17;
                        z2 = z18;
                        str2 = str7;
                        str3 = str8;
                        z3 = z19;
                        str4 = str9;
                        z4 = z20;
                        umaCover = umaCover2;
                        z5 = z21;
                        str5 = str10;
                        c = c2;
                    }
                case 21:
                    Object vip18 = abstractC13345e2.vip(abstractC17080e);
                    if (vip18 == null) {
                        str = "disliked";
                        set = AbstractC0869e.subs(str, str, abstractC17080e, set);
                        z = z17;
                        z2 = z18;
                        str2 = str7;
                        str3 = str8;
                        z3 = z19;
                        str4 = str9;
                        z4 = z20;
                        umaCover = umaCover2;
                        z5 = z21;
                        str5 = str10;
                        c = c2;
                        break;
                    } else {
                        bool9 = (Boolean) vip18;
                        z = z17;
                        z2 = z18;
                        str2 = str7;
                        str3 = str8;
                        z3 = z19;
                        str4 = str9;
                        z4 = z20;
                        umaCover = umaCover2;
                        z5 = z21;
                        str5 = str10;
                        c = c2;
                    }
                default:
                    z = z17;
                    z2 = z18;
                    str2 = str7;
                    str3 = str8;
                    z3 = z19;
                    str4 = str9;
                    z4 = z20;
                    umaCover = umaCover2;
                    z5 = z21;
                    str5 = str10;
                    c = c2;
                    break;
            }
        }
    }
}
