package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3534e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٔۜۙ, eٍؕؓ] */
    public static C3095e ad(boolean z, byte[] bArr) {
        ?? abstractC14985e = new AbstractC14985e();
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        C7936e c7936e = AbstractC1983e.ad;
        int license = (int) AbstractC1983e.license(ByteBuffer.wrap(bArr2), 0, 3);
        byte[] bArr3 = new byte[license];
        System.arraycopy(bArr, 4, bArr3, 0, license);
        int i = license + 4;
        String str = new String(bArr3, InterfaceC2368e.vip);
        EnumC13303e enumC13303e = EnumC13303e.VENDOR;
        abstractC14985e.smaato(new C14189e(enumC13303e.f26533e, 1, str));
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        List admob = abstractC14985e.admob(enumC13303e.f26533e);
        if (admob.size() != 0) {
            ((InterfaceC3589e) admob.get(0)).toString();
        }
        C7936e c7936e2 = ad;
        c7936e2.getClass();
        int i2 = C1724e.ad;
        byte[] bArr4 = new byte[4];
        System.arraycopy(bArr, i, bArr4, 0, 4);
        int i3 = license + 8;
        int license2 = (int) AbstractC1983e.license(ByteBuffer.wrap(bArr4), 0, 3);
        c7936e2.getClass();
        int i4 = 0;
        while (true) {
            if (i4 >= license2) {
                break;
            }
            byte[] bArr5 = new byte[4];
            System.arraycopy(bArr, i3, bArr5, 0, 4);
            i3 += 4;
            int license3 = (int) AbstractC1983e.license(ByteBuffer.wrap(bArr5), 0, 3);
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e2.getClass();
            int i5 = C1724e.ad;
            if (license3 > 10000000) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e2.getClass();
                break;
            }
            if (license3 > bArr.length) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e2.getClass();
                break;
            }
            byte[] bArr6 = new byte[license3];
            System.arraycopy(bArr, i3, bArr6, 0, license3);
            i3 += license3;
            C14189e c14189e = new C14189e();
            String str2 = new String(bArr6, "UTF-8");
            int indexOf = str2.indexOf("=");
            if (indexOf == -1) {
                c14189e.f28040e = "ERRONEOUS";
                c14189e.f28038e = str2;
            } else {
                c14189e.f28040e = str2.substring(0, indexOf).toUpperCase();
                if (str2.length() > indexOf) {
                    c14189e.f28038e = str2.substring(indexOf + 1);
                } else {
                    c14189e.f28038e = BuildConfig.FLAVOR;
                }
            }
            c14189e.ad();
            c7936e2.getClass();
            abstractC14985e.purchase(c14189e);
            i4++;
        }
        if (!z || (bArr[i3] & 1) == 1) {
            return abstractC14985e;
        }
        throw new C1110e("The OGG Stream is not valid, Vorbis tag valid framing bit is wrong %s ", Integer.valueOf(bArr[i3] & 1));
    }
}
