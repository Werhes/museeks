package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3210e implements InterfaceC13403e {
    public final /* synthetic */ int ad;
    public final HashMap metrica;
    public final InterfaceC11571e vip;

    public C3210e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new C3444e(this);
                HashMap vip = C3444e.vip("EXT-X-I-FRAME-STREAM-INF");
                this.metrica = vip;
                vip.put("URI", new C5199e(this, 15));
                return;
            case 2:
                this.vip = new C3444e(this);
                HashMap vip2 = C3444e.vip("EXT-X-STREAM-INF");
                this.metrica = vip2;
                vip2.put("AUDIO", new C5199e(this, 16));
                vip2.put("SUBTITLES", new C5199e(this, 17));
                vip2.put("CLOSED-CAPTIONS", new C5199e(this, 18));
                return;
            case 3:
                this.vip = new C14022e(this);
                HashMap hashMap = new HashMap();
                this.metrica = hashMap;
                hashMap.put("TIME-OFFSET", new C5199e(this, 0));
                hashMap.put("PRECISE", new C5199e(this, 1));
                return;
            default:
                this.vip = new C3444e(this);
                HashMap hashMap2 = new HashMap();
                this.metrica = hashMap2;
                hashMap2.put("TYPE", new C5199e(this, 5));
                hashMap2.put("URI", new C5199e(this, 6));
                hashMap2.put("GROUP-ID", new C5199e(this, 7));
                hashMap2.put("LANGUAGE", new C5199e(this, 8));
                hashMap2.put("ASSOC-LANGUAGE", new C5199e(this, 9));
                hashMap2.put("NAME", new C5199e(this, 10));
                hashMap2.put("DEFAULT", new C5199e(this, 11));
                hashMap2.put("AUTOSELECT", new C5199e(this, 12));
                hashMap2.put("FORCED", new C5199e(this, 13));
                hashMap2.put("INSTREAM-ID", new C5199e(this, 2));
                hashMap2.put("CHARACTERISTICS", new C5199e(this, 3));
                hashMap2.put("CHANNELS", new C5199e(this, 4));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, eٍٖۤ] */
    /* JADX WARN: Type inference failed for: r3v6, types: [eٖٓۧ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [eٗؕۧ, java.lang.Object] */
    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        switch (this.ad) {
            case 0:
                ((C3444e) this.vip).ad(str, c4052e);
                ?? obj = new Object();
                obj.advert = -1;
                C14341e c14341e = (C14341e) c4052e.f8999e;
                c14341e.f28371e = false;
                c14341e.f28368e = false;
                AbstractC0815e.Signature(str, obj, c4052e, this.metrica, "EXT-X-MEDIA");
                ((ArrayList) ((C14341e) c4052e.f8999e).f28372e).add(new C5129e(obj.ad, obj.vip, obj.metrica, obj.license, obj.appmetrica, obj.purchase, obj.billing, obj.yandex, obj.startapp, obj.adcel, obj.mopub, obj.advert));
                return;
            case 1:
                ((C3444e) this.vip).ad(str, c4052e);
                ?? obj2 = new Object();
                obj2.ad = -1;
                obj2.vip = -1;
                obj2.appmetrica = Float.NaN;
                AbstractC0815e.Signature(str, obj2, c4052e, this.metrica, "EXT-X-I-FRAME-STREAM-INF");
                ((ArrayList) ((C14341e) c4052e.f8999e).f28373e).add(new C7297e(obj2.ad, obj2.vip, obj2.metrica, obj2.license, obj2.appmetrica, obj2.purchase, obj2.billing));
                return;
            case 2:
                ((C3444e) this.vip).ad(str, c4052e);
                ?? obj3 = new Object();
                obj3.ad = -1;
                obj3.vip = -1;
                obj3.appmetrica = Float.NaN;
                AbstractC0815e.Signature(str, obj3, c4052e, this.metrica, "EXT-X-STREAM-INF");
                ((C14341e) c4052e.f8999e).f28369e = new C14796e(obj3.ad, obj3.vip, obj3.metrica, obj3.license, obj3.appmetrica, obj3.purchase, obj3.billing, obj3.yandex, obj3.startapp);
                return;
            default:
                if (((C1828e) c4052e.f9004e) != null) {
                    throw C15608e.ad("EXT-X-START", 30, str);
                }
                C9168e c9168e = new C9168e();
                ((C14022e) this.vip).ad(str, c4052e);
                AbstractC0815e.Signature(str, c9168e, c4052e, this.metrica, "EXT-X-START");
                c4052e.f9004e = new C1828e(c9168e.ad, c9168e.vip);
                return;
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final String amazon() {
        switch (this.ad) {
            case 0:
                return "EXT-X-MEDIA";
            case 1:
                return "EXT-X-I-FRAME-STREAM-INF";
            case 2:
                return "EXT-X-STREAM-INF";
            default:
                return "EXT-X-START";
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final boolean loadAd() {
        switch (this.ad) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default:
                return true;
        }
    }
}
