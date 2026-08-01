package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15817e extends AbstractC1305e {
    @Override // defpackage.AbstractC1305e
    public final void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        long j;
        C1781e c1781e;
        C7056e[] c7056eArr = C10744e.license;
        C7408e c7408e = new C7408e(new BufferedInputStream(new C7404e(randomAccessFile)));
        C2637e c2637e = (C2637e) C10744e.purchase.vip(AbstractC12394e.license(c7408e), c7408e, 0L);
        randomAccessFile.seek(0L);
        C11603e c11603e = new C11603e(interfaceC1425e);
        if (!c11603e.f23318e) {
            throw new IllegalStateException("Since the field conversion is not enabled, this method cannot be executed");
        }
        Iterator adcel = c11603e.adcel();
        int i = 2;
        char c = 3;
        EnumC6816e[] enumC6816eArr = {EnumC6816e.CONTENT_DESCRIPTION, EnumC6816e.CONTENT_BRANDING, EnumC6816e.EXTENDED_CONTENT, EnumC6816e.METADATA_OBJECT, EnumC6816e.METADATA_LIBRARY_OBJECT};
        C1781e[] c1781eArr = new C1781e[5];
        for (int i2 = 0; i2 < 5; i2++) {
            EnumC6816e enumC6816e = enumC6816eArr[i2];
            BigInteger bigInteger = BigInteger.ZERO;
            EnumC6816e enumC6816e2 = EnumC6816e.CONTENT_DESCRIPTION;
            if (enumC6816e == enumC6816e2) {
                c1781e = new C1781e(enumC6816e2);
            } else {
                EnumC6816e enumC6816e3 = EnumC6816e.CONTENT_BRANDING;
                c1781e = enumC6816e == enumC6816e3 ? new C1781e(enumC6816e3) : new C1781e(enumC6816e);
            }
            c1781eArr[i2] = c1781e;
        }
        while (true) {
            C5414e c5414e = (C5414e) adcel;
            if (!c5414e.hasNext()) {
                break;
            }
            C10658e c10658e = (C10658e) c5414e.next();
            boolean z = false;
            int i3 = 0;
            while (!z && i3 < 5) {
                EnumC6816e enumC6816e4 = c1781eArr[i3].license;
                C8905e c8905e = c10658e.f20986e;
                EnumC6816e enumC6816e5 = EnumC3488e.ad(c8905e.f17871e).f7917e;
                char c2 = c;
                EnumC6816e[] enumC6816eArr2 = new EnumC6816e[5];
                enumC6816eArr2[0] = EnumC6816e.CONTENT_DESCRIPTION;
                enumC6816eArr2[1] = EnumC6816e.CONTENT_BRANDING;
                enumC6816eArr2[2] = EnumC6816e.EXTENDED_CONTENT;
                enumC6816eArr2[c2] = EnumC6816e.METADATA_OBJECT;
                enumC6816eArr2[4] = EnumC6816e.METADATA_LIBRARY_OBJECT;
                List asList = Arrays.asList(enumC6816eArr2);
                if (asList.indexOf(enumC6816e4) <= asList.indexOf(enumC6816e5) && c1781eArr[i3].yandex(c8905e)) {
                    c1781eArr[i3].vip(c8905e);
                    z = true;
                }
                i3++;
                c = c2;
            }
            c = c;
        }
        boolean[] zArr = new boolean[5];
        for (int i4 = 0; i4 < 5; i4++) {
            zArr[i4] = c2637e.license.containsKey(c1781eArr[i4].license.f14045e);
        }
        C12234e c12234e = (C12234e) c2637e.vip(C7056e.startapp, C12234e.class);
        boolean[] zArr2 = new boolean[5];
        for (int i5 = 0; i5 < 5; i5++) {
            zArr2[i5] = c12234e.license.containsKey(c1781eArr[i5].license.f14045e);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < 5; i6++) {
            C8855e c8855e = new C8855e(c1781eArr[i6]);
            if (zArr[i6]) {
                arrayList.add(c8855e);
            } else if (zArr2[i6]) {
                arrayList2.add(c8855e);
            } else if (i6 == 0 || i6 == 2 || i6 == 1) {
                arrayList.add(c8855e);
            } else {
                arrayList2.add(c8855e);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new C8855e(arrayList2));
        }
        C7404e c7404e = new C7404e(randomAccessFile);
        RandomAccessFile randomAccessFile3 = (RandomAccessFile) c7404e.f15168e;
        C7741e c7741e = new C7741e(randomAccessFile2, i);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        C7056e license = AbstractC12394e.license(c7404e);
        if (!C7056e.yandex.equals(license)) {
            throw new IllegalArgumentException("No ASF header object.");
        }
        long purchase = AbstractC12394e.purchase(c7404e);
        long appmetrica = AbstractC12394e.appmetrica(c7404e);
        byte[] bArr = {(byte) (randomAccessFile3.read() & 255), (byte) (randomAccessFile3.read() & 255)};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j2 = 0;
        byte[] bArr2 = null;
        long j3 = 0;
        long j4 = 0;
        while (j3 < appmetrica) {
            C7056e license2 = AbstractC12394e.license(c7404e);
            if (C7056e.billing.equals(license2)) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                j = purchase;
                long purchase2 = AbstractC12394e.purchase(c7404e);
                AbstractC12394e.startapp(purchase2, byteArrayOutputStream2);
                AbstractC12394e.ad(c7404e, byteArrayOutputStream2, purchase2 - 24);
                bArr2 = byteArrayOutputStream2.toByteArray();
            } else {
                j = purchase;
                boolean z2 = false;
                for (int i7 = 0; i7 < arrayList3.size() && !z2; i7++) {
                    if (((C8855e) arrayList3.get(i7)).ad(license2)) {
                        j4 += r6.ad;
                        j2 += ((C8855e) arrayList3.get(i7)).vip(license2, c7404e, byteArrayOutputStream).vip;
                        arrayList3.remove(i7);
                        z2 = true;
                    }
                }
                if (!z2) {
                    long purchase3 = AbstractC12394e.purchase(c7404e);
                    byteArrayOutputStream.write(license2.ad());
                    AbstractC12394e.startapp(purchase3, byteArrayOutputStream);
                    AbstractC12394e.ad(c7404e, byteArrayOutputStream, purchase3 - 24);
                }
            }
            j3++;
            purchase = j;
        }
        long j5 = purchase;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            j4 += r5.ad;
            j2 += ((C8855e) it.next()).vip(null, null, byteArrayOutputStream).vip;
        }
        c7741e.write(license.ad());
        AbstractC12394e.startapp(j5 + j2, c7741e);
        AbstractC12394e.yandex(appmetrica + j4, c7741e);
        c7741e.write(bArr);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        c7741e.write(C7056e.billing.ad());
        long purchase4 = AbstractC12394e.purchase(byteArrayInputStream);
        AbstractC12394e.startapp(purchase4, c7741e);
        c7741e.write(AbstractC12394e.license(byteArrayInputStream).ad());
        AbstractC12394e.startapp(AbstractC12394e.purchase(byteArrayInputStream) + j2, c7741e);
        AbstractC12394e.ad(byteArrayInputStream, c7741e, purchase4 - 48);
        c7741e.write(byteArrayOutputStream.toByteArray());
        byte[] bArr3 = new byte[8192];
        while (true) {
            int read = c7404e.read(bArr3);
            if (read == -1) {
                return;
            } else {
                c7741e.write(bArr3, 0, read);
            }
        }
    }

    @Override // defpackage.AbstractC1305e
    public final void vip(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) {
        appmetrica(new C11603e(true), randomAccessFile, randomAccessFile2);
    }
}
