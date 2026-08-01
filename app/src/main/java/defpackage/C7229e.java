package defpackage;

import android.os.Bundle;
import j$.util.Objects;
import java.util.EnumMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7229e {
    public static final C7229e purchase = new C7229e((Boolean) null, 100, (Boolean) null, (String) null);
    public final int ad;
    public final EnumMap appmetrica;
    public final String license;
    public final Boolean metrica;
    public final String vip;

    public C7229e(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        this.appmetrica = enumMap;
        enumMap.put((EnumMap) EnumC9102e.AD_USER_DATA, (EnumC9102e) (bool == null ? EnumC18450e.UNINITIALIZED : bool.booleanValue() ? EnumC18450e.GRANTED : EnumC18450e.DENIED));
        this.ad = i;
        this.vip = license();
        this.metrica = bool2;
        this.license = str;
    }

    public C7229e(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC9102e.class);
        this.appmetrica = enumMap2;
        enumMap2.putAll(enumMap);
        this.ad = i;
        this.vip = license();
        this.metrica = bool;
        this.license = str;
    }

    public static C7229e metrica(int i, Bundle bundle) {
        if (bundle == null) {
            return new C7229e((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        for (EnumC9102e enumC9102e : EnumC7033e.DMA.f14395e) {
            enumMap.put((EnumMap) enumC9102e, (EnumC9102e) C5291e.license(bundle.getString(enumC9102e.f18238e)));
        }
        return new C7229e(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C7229e vip(String str) {
        if (str == null || str.length() <= 0) {
            return purchase;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(EnumC9102e.class);
        EnumC9102e[] enumC9102eArr = EnumC7033e.DMA.f14395e;
        int length = enumC9102eArr.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((EnumMap) enumC9102eArr[i2], (EnumC9102e) C5291e.appmetrica(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new C7229e(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public final EnumC18450e ad() {
        EnumC18450e enumC18450e = (EnumC18450e) this.appmetrica.get(EnumC9102e.AD_USER_DATA);
        return enumC18450e == null ? EnumC18450e.UNINITIALIZED : enumC18450e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7229e)) {
            return false;
        }
        C7229e c7229e = (C7229e) obj;
        if (this.vip.equalsIgnoreCase(c7229e.vip) && Objects.equals(this.metrica, c7229e.metrica)) {
            return Objects.equals(this.license, c7229e.license);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.metrica;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.license;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.vip.hashCode() + (i * 29);
    }

    public final String license() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        for (EnumC9102e enumC9102e : EnumC7033e.DMA.f14395e) {
            sb.append(":");
            sb.append(C5291e.yandex((EnumC18450e) this.appmetrica.get(enumC9102e)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C5291e.ad(this.ad));
        for (EnumC9102e enumC9102e : EnumC7033e.DMA.f14395e) {
            sb.append(",");
            sb.append(enumC9102e.f18238e);
            sb.append("=");
            EnumC18450e enumC18450e = (EnumC18450e) this.appmetrica.get(enumC9102e);
            if (enumC18450e == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = enumC18450e.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.metrica;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.license;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }
}
