package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14757e extends AbstractC9743e {
    public final /* synthetic */ int metrica;

    public /* synthetic */ C14757e(int i) {
        this.metrica = i;
    }

    public static C15382e amazon(C1292e c1292e) {
        String tapsense = c1292e.tapsense();
        tapsense.getClass();
        String tapsense2 = c1292e.tapsense();
        tapsense2.getClass();
        return new C15382e(tapsense, tapsense2, c1292e.signatures(), c1292e.signatures(), Arrays.copyOfRange(c1292e.ad, c1292e.vip, c1292e.metrica));
    }

    @Override // defpackage.AbstractC9743e
    public final C17750e billing(C16890e c16890e, ByteBuffer byteBuffer) {
        switch (this.metrica) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                C2125e c2125e = new C2125e(byteBuffer.limit(), byteBuffer.array());
                int i = 12;
                c2125e.loadAd(12);
                int license = (c2125e.license() + c2125e.billing(12)) - 4;
                c2125e.loadAd(44);
                c2125e.Signature(c2125e.billing(12));
                c2125e.loadAd(16);
                ArrayList arrayList = new ArrayList();
                while (c2125e.license() < license) {
                    c2125e.loadAd(48);
                    int billing = c2125e.billing(8);
                    c2125e.loadAd(4);
                    int license2 = c2125e.license() + c2125e.billing(i);
                    String str = null;
                    String str2 = null;
                    while (c2125e.license() < license2) {
                        int billing2 = c2125e.billing(8);
                        int billing3 = c2125e.billing(8);
                        int license3 = c2125e.license() + billing3;
                        if (billing2 == 2) {
                            int billing4 = c2125e.billing(16);
                            c2125e.loadAd(8);
                            if (billing4 == 3) {
                                while (c2125e.license() < license3) {
                                    int billing5 = c2125e.billing(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[billing5];
                                    c2125e.adcel(billing5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int billing6 = c2125e.billing(8);
                                    for (int i2 = 0; i2 < billing6; i2++) {
                                        c2125e.Signature(c2125e.billing(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (billing2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[billing3];
                            c2125e.adcel(billing3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        c2125e.smaato(license3 * 8);
                    }
                    c2125e.smaato(license2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C0442e(billing, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C17750e(arrayList);
            default:
                return new C17750e(amazon(new C1292e(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
