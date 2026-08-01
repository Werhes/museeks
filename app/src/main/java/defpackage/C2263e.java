package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2263e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13270e f5745e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5746e;

    public /* synthetic */ C2263e(AbstractC13270e abstractC13270e, int i) {
        this.f5746e = i;
        this.f5745e = abstractC13270e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f5746e;
        AbstractC13270e abstractC13270e = this.f5745e;
        switch (i) {
            case 0:
                return Arrays.asList(abstractC13270e.advert().mo1886e(AbstractC4972e.mopub), abstractC13270e.advert().mo1886e(AbstractC4972e.smaato), abstractC13270e.advert().mo1886e(AbstractC4972e.amazon), abstractC13270e.advert().mo1886e(AbstractC4972e.advert));
            default:
                EnumMap enumMap = new EnumMap(EnumC3702e.class);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                for (EnumC3702e enumC3702e : EnumC3702e.values()) {
                    String vip = enumC3702e.f8288e.vip();
                    if (vip == null) {
                        AbstractC13270e.ad(47);
                        throw null;
                    }
                    AbstractC10226e mo1458e = abstractC13270e.mopub(vip).mo1458e();
                    if (mo1458e == null) {
                        AbstractC13270e.ad(48);
                        throw null;
                    }
                    String vip2 = enumC3702e.f8286e.vip();
                    if (vip2 == null) {
                        AbstractC13270e.ad(47);
                        throw null;
                    }
                    AbstractC10226e mo1458e2 = abstractC13270e.mopub(vip2).mo1458e();
                    if (mo1458e2 == null) {
                        AbstractC13270e.ad(48);
                        throw null;
                    }
                    enumMap.put((EnumMap) enumC3702e, (EnumC3702e) mo1458e2);
                    hashMap.put(mo1458e, mo1458e2);
                    hashMap2.put(mo1458e2, mo1458e);
                }
                return new C16752e(enumMap, hashMap, hashMap2);
        }
    }
}
