package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12286e implements InterfaceC1272e {
    public final String ad;
    public final boolean appmetrica;
    public final InterfaceC7854e license;
    public InterfaceC5483e purchase;
    public final C8010e vip;
    public int yandex;
    public static final Pattern startapp = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern adcel = Pattern.compile("MPEGTS:(-?\\d+)");
    public final C1292e metrica = new C1292e();
    public byte[] billing = new byte[1024];

    public C12286e(String str, C8010e c8010e, InterfaceC7854e interfaceC7854e, boolean z) {
        this.ad = str;
        this.vip = c8010e;
        this.license = interfaceC7854e;
        this.appmetrica = z;
    }

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    public final InterfaceC18147e billing(long j) {
        InterfaceC18147e Signature = this.purchase.Signature(0, 3);
        C11445e c11445e = new C11445e();
        c11445e.amazon = AbstractC8542e.amazon("text/vtt");
        c11445e.license = this.ad;
        c11445e.remoteconfig = j;
        AbstractC8647e.firebase(c11445e, Signature);
        this.purchase.mopub();
        return Signature;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C14446e c14446e = (C14446e) interfaceC2283e;
        c14446e.billing(this.billing, 0, 6, false);
        byte[] bArr = this.billing;
        C1292e c1292e = this.metrica;
        c1292e.m570throw(6, bArr);
        if (AbstractC6328e.ad(c1292e)) {
            return true;
        }
        c14446e.billing(this.billing, 6, 3, false);
        c1292e.m570throw(9, this.billing);
        return AbstractC6328e.ad(c1292e);
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        if (this.appmetrica) {
            interfaceC5483e = new C5609e(interfaceC5483e, this.license);
        }
        this.purchase = interfaceC5483e;
        interfaceC5483e.pro(new C5990e(-9223372036854775807L));
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        String amazon;
        this.purchase.getClass();
        int length = (int) interfaceC2283e.getLength();
        int i = this.yandex;
        byte[] bArr = this.billing;
        if (i == bArr.length) {
            this.billing = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.billing;
        int i2 = this.yandex;
        int read = interfaceC2283e.read(bArr2, i2, bArr2.length - i2);
        if (read != -1) {
            int i3 = this.yandex + read;
            this.yandex = i3;
            if (length == -1 || i3 != length) {
                return 0;
            }
        }
        C1292e c1292e = new C1292e(this.billing);
        AbstractC6328e.license(c1292e);
        String amazon2 = c1292e.amazon(StandardCharsets.UTF_8);
        long j = 0;
        long j2 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(amazon2)) {
                while (true) {
                    String amazon3 = c1292e.amazon(StandardCharsets.UTF_8);
                    if (amazon3 == null) {
                        break;
                    }
                    if (AbstractC6328e.ad.matcher(amazon3).matches()) {
                        do {
                            amazon = c1292e.amazon(StandardCharsets.UTF_8);
                            if (amazon != null) {
                            }
                        } while (!amazon.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC10259e.ad.matcher(amazon3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    billing(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long metrica = AbstractC6328e.metrica(group);
                String str = AbstractC9413e.ad;
                long vip = this.vip.vip(AbstractC9413e.m2555import((j + metrica) - j2, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                InterfaceC18147e billing = billing(vip - metrica);
                byte[] bArr3 = this.billing;
                int i4 = this.yandex;
                C1292e c1292e2 = this.metrica;
                c1292e2.m570throw(i4, bArr3);
                billing.appmetrica(this.yandex, c1292e2);
                billing.ad(vip, 1, this.yandex, 0, null);
                return -1;
            }
            if (amazon2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = startapp.matcher(amazon2);
                if (!matcher3.find()) {
                    throw C15125e.ad(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(amazon2));
                }
                Matcher matcher4 = adcel.matcher(amazon2);
                if (!matcher4.find()) {
                    throw C15125e.ad(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(amazon2));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j2 = AbstractC6328e.metrica(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = AbstractC9413e.ad;
                j = AbstractC9413e.m2555import(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            amazon2 = c1292e.amazon(StandardCharsets.UTF_8);
        }
    }
}
