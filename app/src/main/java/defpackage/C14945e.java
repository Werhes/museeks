package defpackage;

import java.math.BigInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14945e extends C10658e implements InterfaceC16681e {
    public C14945e(String str, String str2) {
        C8905e c8905e = new C8905e(EnumC3488e.ad(str).f7917e, str, 0, 0);
        this.f20986e = c8905e;
        try {
            switch (c8905e.f17869e) {
                case 0:
                    c8905e.yandex(str2);
                    return;
                case 1:
                    throw new IllegalArgumentException("Cannot interpret binary as string.");
                case 2:
                    c8905e.f17870e = new byte[]{Boolean.parseBoolean(str2)};
                    c8905e.f17869e = 2;
                    return;
                case 3:
                    c8905e.purchase(Long.parseLong(str2));
                    return;
                case 4:
                    c8905e.billing(new BigInteger(str2, 10));
                    return;
                case 5:
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt < 0 || parseInt > 65535) {
                        throw new IllegalArgumentException("value out of range (0-65535)");
                    }
                    long j = parseInt;
                    String str3 = AbstractC12394e.ad;
                    byte[] bArr = new byte[2];
                    for (int i = 0; i < 2; i++) {
                        bArr[i] = (byte) ((j >>> (i * 8)) & 255);
                    }
                    c8905e.f17870e = bArr;
                    c8905e.f17869e = 5;
                    return;
                case 6:
                    C7056e vip = C7056e.vip(str2);
                    IllegalArgumentException ad = c8905e.f17872e.ad(c8905e.f17871e, vip.ad(), 6);
                    if (ad != null) {
                        throw ad;
                    }
                    c8905e.f17870e = vip.ad();
                    c8905e.f17869e = 6;
                    return;
                default:
                    throw new IllegalStateException();
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Value cannot be parsed as Number or is out of range (\"", str2, "\")"), e);
        }
    }

    @Override // defpackage.C10658e, defpackage.InterfaceC3589e
    public final boolean isEmpty() {
        String appmetrica = this.f20986e.appmetrica();
        String str = AbstractC12394e.ad;
        if (appmetrica == null) {
            return true;
        }
        for (int i = 0; i < appmetrica.length(); i++) {
            if (!Character.isWhitespace(appmetrica.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC16681e
    public final String yandex() {
        return this.f20986e.appmetrica();
    }
}
