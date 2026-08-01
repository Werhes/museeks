package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14101e implements InterfaceC13403e {
    public final /* synthetic */ int ad;
    public final HashMap metrica;
    public final C5151e vip;

    public C14101e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = new C5151e(this);
                HashMap hashMap = new HashMap();
                this.metrica = hashMap;
                hashMap.put("URI", new C5199e(this, 24));
                hashMap.put("BYTERANGE", new C5199e(this, 25));
                return;
            case 2:
                this.vip = new C5151e(this);
                HashMap hashMap2 = new HashMap();
                this.metrica = hashMap2;
                hashMap2.put("TIME-OFFSET", new C5199e(this, 26));
                hashMap2.put("PRECISE", new C5199e(this, 27));
                return;
            default:
                this.vip = new C5151e(this);
                HashMap hashMap3 = new HashMap();
                this.metrica = hashMap3;
                hashMap3.put("METHOD", new C5199e(this, 19));
                hashMap3.put("URI", new C5199e(this, 20));
                hashMap3.put("IV", new C5199e(this, 21));
                hashMap3.put("KEYFORMAT", new C5199e(this, 22));
                hashMap3.put("KEYFORMATVERSIONS", new C5199e(this, 23));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eؕۛ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eّؔۢ] */
    @Override // defpackage.InterfaceC11571e
    public final void ad(String str, C4052e c4052e) {
        switch (this.ad) {
            case 0:
                this.vip.ad(str, c4052e);
                ?? obj = new Object();
                obj.license = "identity";
                obj.appmetrica = AbstractC16316e.admob;
                AbstractC0815e.Signature(str, obj, c4052e, this.metrica, "EXT-X-KEY");
                EnumC10061e enumC10061e = obj.ad;
                String str2 = obj.vip;
                C4903e c4903e = new C4903e(enumC10061e, str2, obj.metrica, obj.license, obj.appmetrica);
                if (enumC10061e != EnumC10061e.NONE && str2 == null) {
                    throw C15608e.ad("EXT-X-KEY", 26, str);
                }
                ((C14518e) c4052e.f9005e).f28711e = c4903e;
                return;
            case 1:
                this.vip.ad(str, c4052e);
                ?? obj2 = new Object();
                AbstractC0815e.Signature(str, obj2, c4052e, this.metrica, "EXT-X-MAP");
                ((C14518e) c4052e.f9005e).f28702e = new C4438e(obj2.ad, obj2.vip);
                return;
            default:
                this.vip.ad(str, c4052e);
                C9168e c9168e = new C9168e();
                AbstractC0815e.Signature(str, c9168e, c4052e, this.metrica, "EXT-X-START");
                ((C14518e) c4052e.f9005e).f28707e = new C1828e(c9168e.ad, c9168e.vip);
                return;
        }
    }

    @Override // defpackage.InterfaceC13403e
    public final String amazon() {
        switch (this.ad) {
            case 0:
                return "EXT-X-KEY";
            case 1:
                return "EXT-X-MAP";
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
            default:
                return true;
        }
    }
}
