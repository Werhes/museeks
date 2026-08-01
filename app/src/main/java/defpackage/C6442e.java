package defpackage;

import java.util.ArrayList;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6442e extends AbstractC7654e {

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C13635e f13334e = new C13635e(AbstractC3820e.ad.vip(C6442e.class));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C16801e f13335e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C6019e f13336e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C6019e f13337e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C10033e f13338e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C6019e f13339e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f13340e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final boolean f13341e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final boolean f13342e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C8169e f13343e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C7190e f13344e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C6019e f13345e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final Map f13346e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16801e f13347e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C16074e f13348e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5267e f13349e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f13350e;

    public /* synthetic */ C6442e(C16801e c16801e, C5267e c5267e, C7190e c7190e, C16074e c16074e, C6019e c6019e, C6019e c6019e2, C6019e c6019e3, C6019e c6019e4, C8169e c8169e, int i) {
        this(c16801e, null, false, c5267e, c7190e, c16074e, null, c6019e, c6019e2, c6019e3, (i & 1024) != 0 ? null : c6019e4, false, (i & 4096) != 0 ? null : c8169e, false, null, C9139e.f18290e, C0193e.f1409e);
    }

    public C6442e(C16801e c16801e, C16801e c16801e2, boolean z, C5267e c5267e, C7190e c7190e, C16074e c16074e, C10033e c10033e, C6019e c6019e, C6019e c6019e2, C6019e c6019e3, C6019e c6019e4, boolean z2, C8169e c8169e, boolean z3, String str, Map map, C0193e c0193e) {
        super(f13334e, c0193e);
        this.f13347e = c16801e;
        this.f13335e = c16801e2;
        this.f13350e = z;
        this.f13349e = c5267e;
        this.f13344e = c7190e;
        this.f13348e = c16074e;
        this.f13338e = c10033e;
        this.f13345e = c6019e;
        this.f13337e = c6019e2;
        this.f13336e = c6019e3;
        this.f13339e = c6019e4;
        this.f13342e = z2;
        this.f13343e = c8169e;
        this.f13341e = z3;
        this.f13340e = str;
        this.f13346e = AbstractC4224e.yandex("auto_eq_map_cache", map);
    }

    public static C6442e vip(C6442e c6442e, C16801e c16801e, C5267e c5267e, C7190e c7190e, C16074e c16074e, C6019e c6019e, C6019e c6019e2, C6019e c6019e3, C6019e c6019e4, int i) {
        C16801e c16801e2 = (i & 1) != 0 ? c6442e.f13347e : c16801e;
        C16801e c16801e3 = c6442e.f13335e;
        boolean z = c6442e.f13350e;
        C5267e c5267e2 = (i & 8) != 0 ? c6442e.f13349e : c5267e;
        C7190e c7190e2 = (i & 16) != 0 ? c6442e.f13344e : c7190e;
        C16074e c16074e2 = (i & 32) != 0 ? c6442e.f13348e : c16074e;
        C10033e c10033e = c6442e.f13338e;
        C6019e c6019e5 = (i & 128) != 0 ? c6442e.f13345e : c6019e;
        C6019e c6019e6 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c6442e.f13337e : c6019e2;
        C6019e c6019e7 = (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c6442e.f13336e : c6019e3;
        C6019e c6019e8 = (i & 1024) != 0 ? c6442e.f13339e : c6019e4;
        boolean z2 = c6442e.f13342e;
        C8169e c8169e = c6442e.f13343e;
        boolean z3 = c6442e.f13341e;
        String str = c6442e.f13340e;
        Map map = c6442e.f13346e;
        C0193e ad = c6442e.ad();
        c6442e.getClass();
        return new C6442e(c16801e2, c16801e3, z, c5267e2, c7190e2, c16074e2, c10033e, c6019e5, c6019e6, c6019e7, c6019e8, z2, c8169e, z3, str, map, ad);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6442e)) {
            return false;
        }
        C6442e c6442e = (C6442e) obj;
        return AbstractC7890e.billing(ad(), c6442e.ad()) && AbstractC7890e.billing(this.f13347e, c6442e.f13347e) && AbstractC7890e.billing(this.f13335e, c6442e.f13335e) && this.f13350e == c6442e.f13350e && AbstractC7890e.billing(this.f13349e, c6442e.f13349e) && AbstractC7890e.billing(this.f13344e, c6442e.f13344e) && AbstractC7890e.billing(this.f13348e, c6442e.f13348e) && AbstractC7890e.billing(this.f13338e, c6442e.f13338e) && AbstractC7890e.billing(this.f13345e, c6442e.f13345e) && AbstractC7890e.billing(this.f13337e, c6442e.f13337e) && AbstractC7890e.billing(this.f13336e, c6442e.f13336e) && AbstractC7890e.billing(this.f13339e, c6442e.f13339e) && this.f13342e == c6442e.f13342e && AbstractC7890e.billing(this.f13343e, c6442e.f13343e) && this.f13341e == c6442e.f13341e && AbstractC7890e.billing(this.f13340e, c6442e.f13340e) && AbstractC7890e.billing(this.f13346e, c6442e.f13346e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = ad().hashCode() * 37;
        C16801e c16801e = this.f13347e;
        int hashCode2 = (hashCode + (c16801e != null ? c16801e.hashCode() : 0)) * 37;
        C16801e c16801e2 = this.f13335e;
        int hashCode3 = (((hashCode2 + (c16801e2 != null ? c16801e2.hashCode() : 0)) * 37) + (this.f13350e ? 1231 : 1237)) * 37;
        C5267e c5267e = this.f13349e;
        int hashCode4 = (hashCode3 + (c5267e != null ? c5267e.hashCode() : 0)) * 37;
        C7190e c7190e = this.f13344e;
        int hashCode5 = (hashCode4 + (c7190e != null ? c7190e.hashCode() : 0)) * 37;
        C16074e c16074e = this.f13348e;
        int hashCode6 = (hashCode5 + (c16074e != null ? c16074e.hashCode() : 0)) * 37;
        C10033e c10033e = this.f13338e;
        int hashCode7 = (hashCode6 + (c10033e != null ? c10033e.hashCode() : 0)) * 37;
        C6019e c6019e = this.f13345e;
        int hashCode8 = (hashCode7 + (c6019e != null ? c6019e.hashCode() : 0)) * 37;
        C6019e c6019e2 = this.f13337e;
        int hashCode9 = (hashCode8 + (c6019e2 != null ? c6019e2.hashCode() : 0)) * 37;
        C6019e c6019e3 = this.f13336e;
        int hashCode10 = (hashCode9 + (c6019e3 != null ? c6019e3.hashCode() : 0)) * 37;
        C6019e c6019e4 = this.f13339e;
        int hashCode11 = (((hashCode10 + (c6019e4 != null ? c6019e4.hashCode() : 0)) * 37) + (this.f13342e ? 1231 : 1237)) * 37;
        C8169e c8169e = this.f13343e;
        int hashCode12 = (((hashCode11 + (c8169e != null ? c8169e.hashCode() : 0)) * 37) + (this.f13341e ? 1231 : 1237)) * 37;
        String str = this.f13340e;
        int hashCode13 = this.f13346e.hashCode() + ((hashCode12 + (str != null ? str.hashCode() : 0)) * 37);
        this.f15551e = hashCode13;
        return hashCode13;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C16801e c16801e = this.f13347e;
        if (c16801e != null) {
            arrayList.add("equalizer_10band=" + c16801e);
        }
        C16801e c16801e2 = this.f13335e;
        if (c16801e2 != null) {
            arrayList.add("equalizer_5band=" + c16801e2);
        }
        AbstractC8647e.m2460this(new StringBuilder("use_5band_equalizer="), this.f13350e, arrayList);
        C5267e c5267e = this.f13349e;
        if (c5267e != null) {
            arrayList.add("compressor=" + c5267e);
        }
        C7190e c7190e = this.f13344e;
        if (c7190e != null) {
            arrayList.add("limiter=" + c7190e);
        }
        C16074e c16074e = this.f13348e;
        if (c16074e != null) {
            arrayList.add("gain=" + c16074e);
        }
        C10033e c10033e = this.f13338e;
        if (c10033e != null) {
            arrayList.add("exported=" + c10033e);
        }
        C6019e c6019e = this.f13345e;
        if (c6019e != null) {
            arrayList.add("legacy_virtualization=" + c6019e);
        }
        C6019e c6019e2 = this.f13337e;
        if (c6019e2 != null) {
            arrayList.add("legacy_bass_boost=" + c6019e2);
        }
        C6019e c6019e3 = this.f13336e;
        if (c6019e3 != null) {
            arrayList.add("legacy_reverb=" + c6019e3);
        }
        C6019e c6019e4 = this.f13339e;
        if (c6019e4 != null) {
            arrayList.add("legacy_env_reverb=" + c6019e4);
        }
        AbstractC8647e.m2460this(new StringBuilder("use_haptic_generator="), this.f13342e, arrayList);
        C8169e c8169e = this.f13343e;
        if (c8169e != null) {
            arrayList.add("crossfade=" + c8169e);
        }
        AbstractC8647e.m2460this(new StringBuilder("auto_eq_enabled="), this.f13341e, arrayList);
        String str = this.f13340e;
        if (str != null) {
            AbstractC8647e.m2457goto(str, "auto_eq_preset_id=", arrayList);
        }
        Map map = this.f13346e;
        if (!map.isEmpty()) {
            arrayList.add("auto_eq_map_cache=" + map);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "VkxDspBundle{", "}", null, 56);
    }
}
