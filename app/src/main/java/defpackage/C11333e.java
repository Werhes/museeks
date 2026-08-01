package defpackage;

import android.os.Build;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۡۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11333e extends AbstractC7654e {

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C10962e f22783e = new AbstractC11069e(3, AbstractC3820e.ad.vip(C11333e.class), 2, null);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f22784e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C18099e f22785e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final EnumC3531e f22786e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final String f22787e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C17832e f22788e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C14632e f22789e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f22790e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f22791e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f22792e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final String f22793e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f22794e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f22795e;

    public /* synthetic */ C11333e(int i, boolean z, EnumC3531e enumC3531e, C18099e c18099e, C17832e c17832e, C14632e c14632e, int i2) {
        this((i2 & 1) != 0 ? BuildConfig.FLAVOR : Build.VERSION.RELEASE, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? BuildConfig.FLAVOR : Build.BOARD, (i2 & 8) != 0 ? BuildConfig.FLAVOR : Build.BRAND, (i2 & 16) != 0 ? BuildConfig.FLAVOR : Build.DEVICE, (i2 & 32) != 0 ? BuildConfig.FLAVOR : Build.MODEL, (i2 & 64) != 0 ? BuildConfig.FLAVOR : Build.MANUFACTURER, (i2 & 128) != 0 ? false : z, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? EnumC3531e.StockOrUnknown : enumC3531e, (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : c18099e, (i2 & 1024) != 0 ? null : c17832e, (i2 & 2048) != 0 ? null : c14632e, C0193e.f1409e);
    }

    public C11333e(String str, int i, String str2, String str3, String str4, String str5, String str6, boolean z, EnumC3531e enumC3531e, C18099e c18099e, C17832e c17832e, C14632e c14632e, C0193e c0193e) {
        super(f22783e, c0193e);
        this.f22792e = str;
        this.f22784e = i;
        this.f22795e = str2;
        this.f22794e = str3;
        this.f22790e = str4;
        this.f22793e = str5;
        this.f22787e = str6;
        this.f22791e = z;
        this.f22786e = enumC3531e;
        this.f22785e = c18099e;
        this.f22788e = c17832e;
        this.f22789e = c14632e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11333e)) {
            return false;
        }
        C11333e c11333e = (C11333e) obj;
        return AbstractC7890e.billing(ad(), c11333e.ad()) && AbstractC7890e.billing(this.f22792e, c11333e.f22792e) && this.f22784e == c11333e.f22784e && AbstractC7890e.billing(this.f22795e, c11333e.f22795e) && AbstractC7890e.billing(this.f22794e, c11333e.f22794e) && AbstractC7890e.billing(this.f22790e, c11333e.f22790e) && AbstractC7890e.billing(this.f22793e, c11333e.f22793e) && AbstractC7890e.billing(this.f22787e, c11333e.f22787e) && this.f22791e == c11333e.f22791e && this.f22786e == c11333e.f22786e && AbstractC7890e.billing(this.f22785e, c11333e.f22785e) && AbstractC7890e.billing(this.f22788e, c11333e.f22788e) && AbstractC7890e.billing(this.f22789e, c11333e.f22789e);
    }

    public final int hashCode() {
        int i = this.f15551e;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.f22786e.hashCode() + ((AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert((AbstractC1786e.advert(ad().hashCode() * 37, 37, this.f22792e) + this.f22784e) * 37, 37, this.f22795e), 37, this.f22794e), 37, this.f22790e), 37, this.f22793e), 37, this.f22787e) + (this.f22791e ? 1231 : 1237)) * 37)) * 37;
        C18099e c18099e = this.f22785e;
        int hashCode2 = (hashCode + (c18099e != null ? c18099e.hashCode() : 0)) * 37;
        C17832e c17832e = this.f22788e;
        int hashCode3 = (hashCode2 + (c17832e != null ? c17832e.hashCode() : 0)) * 37;
        C14632e c14632e = this.f22789e;
        int hashCode4 = hashCode3 + (c14632e != null ? c14632e.hashCode() : 0);
        this.f15551e = hashCode4;
        return hashCode4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android_version_name=".concat(AbstractC4224e.advert(this.f22792e)));
        arrayList.add("android_sdk_int=" + this.f22784e);
        AbstractC8647e.m2457goto(this.f22795e, "board=", arrayList);
        AbstractC8647e.m2457goto(this.f22794e, "brand=", arrayList);
        AbstractC8647e.m2457goto(this.f22790e, "device=", arrayList);
        AbstractC8647e.m2457goto(this.f22793e, "model=", arrayList);
        arrayList.add("manufacturer=".concat(AbstractC4224e.advert(this.f22787e)));
        StringBuilder premium = AbstractC8647e.premium(new StringBuilder("has_gms="), this.f22791e, arrayList, "oem_flavor=");
        premium.append(this.f22786e);
        arrayList.add(premium.toString());
        C18099e c18099e = this.f22785e;
        if (c18099e != null) {
            arrayList.add("miui_metadata=" + c18099e);
        }
        C17832e c17832e = this.f22788e;
        if (c17832e != null) {
            arrayList.add("emui_metadata=" + c17832e);
        }
        C14632e c14632e = this.f22789e;
        if (c14632e != null) {
            arrayList.add("oneui_metadata=" + c14632e);
        }
        return AbstractC13480e.m3608try(arrayList, ", ", "OrbitCoreAndroidDeviceInfo{", "}", null, 56);
    }
}
