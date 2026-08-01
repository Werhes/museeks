package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10851e implements InterfaceC10647e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Size f21491e = new Size(1280, 720);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14677e f21492e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10354e f21493e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC14627e f21494e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Size f21495e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f21496e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Range f21497e;

    public C10851e(String str, EnumC14627e enumC14627e, C10354e c10354e, Size size, C14677e c14677e, Range range) {
        this.f21496e = str;
        this.f21494e = enumC14627e;
        this.f21493e = c10354e;
        this.f21495e = size;
        this.f21492e = c14677e;
        this.f21497e = range;
    }

    @Override // defpackage.InterfaceC10647e
    public final Object get() {
        Integer num;
        LinkedHashMap linkedHashMap = AbstractC14417e.ad;
        C12899e vip = AbstractC14417e.vip(this.f21493e, this.f21497e);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = vip.ad;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = vip.vip;
        sb.append(i2);
        sb.append("fps.");
        AbstractC9464e.yandex("VidEncCfgDefaultRslvr", sb.toString());
        AbstractC9464e.yandex("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        C14677e c14677e = this.f21492e;
        int i3 = c14677e.vip;
        int i4 = vip.vip;
        Size size = this.f21495e;
        int width = size.getWidth();
        Size size2 = f21491e;
        int license = AbstractC14417e.license(14000000, i3, 8, i4, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight());
        HashMap hashMap = AbstractC6814e.appmetrica;
        String str = this.f21496e;
        Map map = (Map) hashMap.get(str);
        int intValue = (map == null || (num = (Integer) map.get(c14677e)) == null) ? -1 : num.intValue();
        C7248e ad = AbstractC14417e.ad(intValue, str);
        C14742e license2 = C12488e.license();
        license2.vip = str;
        EnumC14627e enumC14627e = this.f21494e;
        if (enumC14627e == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        license2.license = enumC14627e;
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        license2.appmetrica = size;
        license2.mopub = Integer.valueOf(license);
        license2.yandex = Integer.valueOf(i);
        license2.startapp = Integer.valueOf(i2);
        license2.metrica = Integer.valueOf(intValue);
        license2.billing = ad;
        return license2.license();
    }
}
