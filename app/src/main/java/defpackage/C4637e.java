package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4637e {
    public static final Object billing;
    public static final LinkedHashMap yandex;
    public final EnumC14212e ad;
    public final int license;
    public final EnumC2392e metrica;
    public final EnumC15386e vip;
    public static final EnumC2392e appmetrica = EnumC2392e.DEFAULT;
    public static final EnumC15386e[] purchase = {EnumC15386e.S720P_16_9, EnumC15386e.S1080P_4_3, EnumC15386e.S1080P_16_9, EnumC15386e.S1440P_16_9, EnumC15386e.UHD, EnumC15386e.X_VGA};

    static {
        Map purchase2 = AbstractC10064e.purchase(new C6571e(EnumC14212e.f28076e, 35), new C6571e(EnumC14212e.f28075e, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES)), new C6571e(EnumC14212e.f28077e, 4101), new C6571e(EnumC14212e.f28074e, 32), new C6571e(EnumC14212e.f28078e, 34));
        billing = purchase2;
        Set<Map.Entry> entrySet = purchase2.entrySet();
        int appmetrica2 = AbstractC10064e.appmetrica(AbstractC0746e.subscription(entrySet, 10));
        if (appmetrica2 < 16) {
            appmetrica2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica2);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (EnumC14212e) entry.getKey());
        }
        yandex = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public C4637e(EnumC14212e enumC14212e, EnumC15386e enumC15386e, EnumC2392e enumC2392e) {
        this.ad = enumC14212e;
        this.vip = enumC15386e;
        this.metrica = enumC2392e;
        Integer num = (Integer) billing.get(enumC14212e);
        this.license = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4637e)) {
            return false;
        }
        C4637e c4637e = (C4637e) obj;
        return this.ad == c4637e.ad && this.vip == c4637e.vip && this.metrica == c4637e.metrica;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.ad + ", configSize=" + this.vip + ", streamUseCase=" + this.metrica + ')';
    }
}
