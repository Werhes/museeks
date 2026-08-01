package defpackage;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۤؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18468e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C0320e f36195e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f36196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18468e(ByteBuffer byteBuffer, C18524e c18524e, int i) {
        super(byteBuffer, c18524e, 7);
        this.f36196e = i;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eٓٔؔ */
    public final boolean mo741e() {
        String str;
        switch (this.f36196e) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f22046e;
                String adcel = AbstractC1983e.adcel(byteBuffer);
                if ("stoc".equals(adcel) || "pdos".equals(adcel)) {
                    int i = byteBuffer.get() & 255;
                    byte[] bArr = new byte[i];
                    byteBuffer.get(bArr);
                    str = new String(bArr, 0, i, AbstractC4639e.vip);
                } else {
                    str = null;
                }
                this.f36195e.pro.add(AbstractC4653e.isPro(adcel, ": ", str));
                return true;
            case 1:
                ByteBuffer byteBuffer2 = (ByteBuffer) this.f22046e;
                short s = byteBuffer2.getShort();
                C7936e c7936e = AbstractC1983e.ad;
                int i2 = s & 65535;
                for (int i3 = 0; i3 < i2; i3++) {
                    Date ad = AbstractC1394e.ad(byteBuffer2.getInt() & 4294967295L);
                    byteBuffer2.getShort();
                    C7936e c7936e2 = AbstractC1983e.ad;
                    int i4 = byteBuffer2.getShort() & 65535;
                    String str2 = AbstractC1983e.billing(byteBuffer2, 0, i4, AbstractC4639e.vip) + " " + AbstractC1394e.ad.format(ad);
                    if (i4 % 2 != 0) {
                        byteBuffer2.get();
                    }
                    this.f36195e.signatures.add(str2);
                }
                return true;
            case 2:
                C0320e c0320e = this.f36195e;
                ByteBuffer byteBuffer3 = (ByteBuffer) this.f22046e;
                short s2 = byteBuffer3.getShort();
                C7936e c7936e3 = AbstractC1983e.ad;
                int i5 = s2 & 65535;
                long j = byteBuffer3.getInt();
                int i6 = 65535 & byteBuffer3.getShort();
                SimpleDateFormat simpleDateFormat = AbstractC1394e.ad;
                byte[] bArr2 = new byte[10];
                byteBuffer3.get(bArr2);
                byte b = bArr2[0];
                int i7 = b >> 7;
                int i8 = (((b << 8) | bArr2[1]) & 32767) - 16445;
                long j2 = 0;
                int i9 = 55;
                for (int i10 = 2; i10 < 9; i10++) {
                    j2 |= (bArr2[i10] & 255) << i9;
                    i9 -= 8;
                }
                double pow = Math.pow(2.0d, i8) * ((bArr2[9] >>> 1) | j2);
                if (i7 != 0) {
                    pow = -pow;
                }
                if (c0320e.amazon != EnumC12884e.f25730e) {
                    c0320e.adcel = true;
                    EnumC1915e enumC1915e = EnumC1915e.f5106e;
                    c0320e.yandex = "not compressed";
                    c0320e.startapp = false;
                } else {
                    if (byteBuffer3.remaining() == 0) {
                        return false;
                    }
                    String adcel2 = AbstractC1983e.adcel(byteBuffer3);
                    EnumC1915e enumC1915e2 = EnumC1915e.f5106e;
                    if (adcel2.equals("sowt")) {
                        c0320e.Signature = EnumC8849e.f17773e;
                    }
                    int i11 = byteBuffer3.get() & 255;
                    byte[] bArr3 = new byte[i11];
                    byteBuffer3.get(bArr3);
                    String str3 = new String(bArr3, 0, i11, AbstractC4639e.vip);
                    EnumC1915e enumC1915e3 = (EnumC1915e) EnumC1915e.f5105e.get(adcel2);
                    if (enumC1915e3 != null) {
                        str3 = enumC1915e3.f5109e;
                        c0320e.adcel = enumC1915e3.f5108e;
                        if (enumC1915e3 == EnumC1915e.f5106e) {
                            c0320e.startapp = false;
                        }
                    } else {
                        c0320e.adcel = false;
                    }
                    if (str3.isEmpty()) {
                        c0320e.yandex = adcel2;
                    } else {
                        c0320e.yandex = str3;
                    }
                }
                c0320e.billing = i6;
                c0320e.purchase = (int) pow;
                c0320e.appmetrica = i5;
                c0320e.mopub = j / pow;
                c0320e.advert = j;
                return true;
            default:
                this.f36195e.loadAd = AbstractC1394e.ad(((ByteBuffer) this.f22046e).getInt());
                return true;
        }
    }
}
