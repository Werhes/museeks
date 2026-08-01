package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3443e implements InterfaceC13403e {
    public final /* synthetic */ int ad;
    public final InterfaceC11571e vip;

    public C3443e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new C5151e(this);
                return;
            case 2:
                this.vip = new C5151e(this);
                return;
            case 3:
                this.vip = new C5151e(this);
                return;
            case 4:
                this.vip = new C5151e(this);
                return;
            case 5:
                this.vip = new C5151e(this);
                return;
            case 6:
                this.vip = new C5151e(this);
                return;
            case 7:
                this.vip = new C5151e(this);
                return;
            case 8:
                this.vip = new C5151e(this);
                return;
            case 9:
                this.vip = new C5151e(this);
                return;
            case 10:
                this.vip = new C14022e(this);
                return;
            default:
                this.vip = new C5151e(this);
                return;
        }
    }

    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        switch (this.ad) {
            case 0:
                ((C5151e) this.vip).ad(str, c4052e);
                AbstractC0815e.advert(AbstractC16316e.amazon, str, "EXT-X-DISCONTINUITY");
                ((C14518e) c4052e.f9005e).f28703e = true;
                return;
            case 1:
                ((C5151e) this.vip).ad(str, c4052e);
                Matcher advert = AbstractC0815e.advert(AbstractC16316e.loadAd, str, "EXT-X-BYTERANGE");
                ((C14518e) c4052e.f9005e).f28706e = AbstractC0815e.smaato(advert);
                return;
            case 2:
                ((C5151e) this.vip).ad(str, c4052e);
                AbstractC0815e.advert(AbstractC16316e.advert, str, "EXT-X-ENDLIST");
                ((C14518e) c4052e.f9005e).f28709e = true;
                return;
            case 3:
                ((C5151e) this.vip).ad(str, c4052e);
                AbstractC0815e.advert(AbstractC16316e.smaato, str, "EXT-X-I-FRAMES-ONLY");
                if (c4052e.f9001e < 4) {
                    throw C15608e.ad("EXT-X-I-FRAMES-ONLY", 40, null);
                }
                if (((C14341e) c4052e.f8999e) != null) {
                    throw new C15608e(22, null);
                }
                ((C14518e) c4052e.f9005e).f28714e = true;
                return;
            case 4:
                ((C5151e) this.vip).ad(str, c4052e);
                Matcher advert2 = AbstractC0815e.advert(AbstractC16316e.yandex, str, "EXT-X-PLAYLIST-TYPE");
                C14518e c14518e = (C14518e) c4052e.f9005e;
                if (c14518e.f28713e != null) {
                    throw C15608e.ad("EXT-X-PLAYLIST-TYPE", 30, str);
                }
                String group = advert2.group(1);
                try {
                    c14518e.f28713e = (EnumC3923e) Enum.valueOf(EnumC3923e.class, group);
                    return;
                } catch (IllegalArgumentException unused) {
                    throw C15608e.ad("EXT-X-PLAYLIST-TYPE", 32, group);
                }
            case 5:
                ((C5151e) this.vip).ad(str, c4052e);
                Pattern pattern = AbstractC16316e.startapp;
                AbstractC0815e.advert(pattern, str, "EXT-X-PROGRAM-DATE-TIME");
                C14518e c14518e2 = (C14518e) c4052e.f9005e;
                if (c14518e2.f28705e != null) {
                    throw C15608e.ad("EXT-X-PROGRAM-DATE-TIME", 30, str);
                }
                Matcher matcher = pattern.matcher(str);
                if (!matcher.matches()) {
                    throw new C15608e(19, "EXT-X-PROGRAM-DATE-TIME");
                }
                c14518e2.f28705e = matcher.group(1);
                return;
            case 6:
                ((C5151e) this.vip).ad(str, c4052e);
                Matcher advert3 = AbstractC0815e.advert(AbstractC16316e.purchase, str, "EXT-X-TARGETDURATION");
                C14518e c14518e3 = (C14518e) c4052e.f9005e;
                if (c14518e3.f28710e != null) {
                    throw C15608e.ad("EXT-X-TARGETDURATION", 30, str);
                }
                c14518e3.f28710e = Integer.valueOf(AbstractC0815e.admob(advert3.group(1), "EXT-X-TARGETDURATION"));
                return;
            case 7:
                ((C5151e) this.vip).ad(str, c4052e);
                Matcher advert4 = AbstractC0815e.advert(AbstractC16316e.billing, str, "EXT-X-MEDIA-SEQUENCE");
                C14518e c14518e4 = (C14518e) c4052e.f9005e;
                if (c14518e4.f28701e != null) {
                    throw C15608e.ad("EXT-X-MEDIA-SEQUENCE", 30, str);
                }
                c14518e4.f28701e = Integer.valueOf(AbstractC0815e.admob(advert4.group(1), "EXT-X-MEDIA-SEQUENCE"));
                return;
            case 8:
                ((C5151e) this.vip).ad(str, c4052e);
                return;
            case 9:
                ((C5151e) this.vip).ad(str, c4052e);
                Matcher advert5 = AbstractC0815e.advert(AbstractC16316e.mopub, str, "EXTINF");
                C14518e c14518e5 = (C14518e) c4052e.f9005e;
                String group2 = advert5.group(1);
                try {
                    c14518e5.f28708e = new C14943e(advert5.group(2), Float.parseFloat(group2));
                    return;
                } catch (NumberFormatException unused2) {
                    throw C15608e.ad("EXTINF", 33, group2);
                }
            default:
                ((C14022e) this.vip).ad(str, c4052e);
                Matcher advert6 = AbstractC0815e.advert(AbstractC16316e.appmetrica, str, "EXT-X-VERSION");
                if (c4052e.f9001e != -1) {
                    throw C15608e.ad("EXT-X-VERSION", 30, str);
                }
                int admob = AbstractC0815e.admob(advert6.group(1), "EXT-X-VERSION");
                if (admob < 1) {
                    throw C15608e.ad("EXT-X-VERSION", 10, str);
                }
                if (admob > Integer.MAX_VALUE) {
                    throw C15608e.ad("EXT-X-VERSION", 37, str);
                }
                c4052e.f9001e = admob;
                return;
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final String amazon() {
        switch (this.ad) {
            case 0:
                return "EXT-X-DISCONTINUITY";
            case 1:
                return "EXT-X-BYTERANGE";
            case 2:
                return "EXT-X-ENDLIST";
            case 3:
                return "EXT-X-I-FRAMES-ONLY";
            case 4:
                return "EXT-X-PLAYLIST-TYPE";
            case 5:
                return "EXT-X-PROGRAM-DATE-TIME";
            case 6:
                return "EXT-X-TARGETDURATION";
            case 7:
                return "EXT-X-MEDIA-SEQUENCE";
            case 8:
                return "EXT-X-ALLOW-CACHE";
            case 9:
                return "EXTINF";
            default:
                return "EXT-X-VERSION";
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final boolean loadAd() {
        switch (this.ad) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            default:
                return true;
        }
    }
}
