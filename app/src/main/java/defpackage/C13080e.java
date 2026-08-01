package defpackage;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: eؘْؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13080e extends BufferedWriter {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public char[] f26011e;

    public final void ad(C12324e c12324e) {
        int i;
        String str = c12324e.ad;
        write("-----BEGIN " + str + "-----");
        newLine();
        List list = c12324e.vip;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            newLine();
        }
        byte[] bArr = c12324e.metrica;
        char[] cArr = this.f26011e;
        C7358e c7358e = AbstractC0759e.ad;
        int length = bArr.length;
        C7358e c7358e2 = AbstractC0759e.ad;
        c7358e2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            c7358e2.vip(bArr, 0, length, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i2 = 0; i2 < byteArray.length; i2 += cArr.length) {
                int i3 = 0;
                while (i3 != cArr.length && (i = i2 + i3) < byteArray.length) {
                    cArr[i3] = (char) byteArray[i];
                    i3++;
                }
                write(cArr, 0, i3);
                newLine();
            }
            write("-----END " + str + "-----");
            newLine();
        } catch (Exception e) {
            throw new Cabstract(AbstractC1786e.remoteconfig(e, new StringBuilder("exception encoding base64 string: ")), e, 2);
        }
    }
}
