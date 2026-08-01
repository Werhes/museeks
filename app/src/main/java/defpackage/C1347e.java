package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eؒۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1347e extends AbstractC13156e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f4138e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f4139e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f4140e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f4141e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final long f4142e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f4143e;

    public C1347e(int i, ArrayList arrayList, ArrayList arrayList2, long j, long j2, boolean z) {
        super(true);
        this.f4142e = 0L;
        this.f4140e = i;
        this.f4141e = DesugarCollections.unmodifiableList(arrayList);
        this.f4138e = DesugarCollections.unmodifiableList(arrayList2);
        this.f4142e = j;
        this.f4143e = j2;
        this.f4139e = z;
    }

    public C1347e(C16849e c16849e, long j, long j2) {
        super(true);
        List list;
        boolean z;
        this.f4142e = 0L;
        this.f4140e = 1;
        this.f4141e = Collections.singletonList(c16849e);
        this.f4138e = Collections.EMPTY_LIST;
        this.f4142e = j;
        this.f4143e = j2;
        this.f4139e = false;
        synchronized (this) {
            list = this.f4141e;
        }
        int size = list.size();
        long[] jArr = new long[size];
        long ad = ad();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            int i = ((C16849e) list.get(size2)).f33015e.metrica;
            jArr[size2] = ((1 << i) - 1) & ad;
            ad >>>= i;
        }
        C16849e[] c16849eArr = (C16849e[]) list.toArray(new C16849e[list.size()]);
        List list2 = this.f4138e;
        C12968e[] c12968eArr = (C12968e[]) list2.toArray(new C12968e[list2.size()]);
        C16849e c16849e2 = (C16849e) this.f4141e.get(0);
        long license = c16849eArr[0].license() - 1;
        long j3 = jArr[0];
        if (license != j3) {
            c16849eArr[0] = AbstractC0258e.metrica(c16849e2.f33015e, c16849e2.f33020e, (int) j3, AbstractC12442e.license(c16849e2.f33017e), AbstractC12442e.license(c16849e2.f33023e));
            z = true;
        } else {
            z = false;
        }
        int i2 = 1;
        while (i2 < size) {
            int i3 = i2 - 1;
            C16849e c16849e3 = c16849eArr[i3];
            int i4 = c16849e3.f33020e.vip;
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[i4];
            C6148e c6148e = new C6148e(AbstractC12442e.license(c16849e3.f33017e), AbstractC12442e.license(c16849e3.f33023e), AbstractC1266e.metrica(c16849e3.f33020e));
            int i5 = size;
            long[] jArr2 = jArr;
            c6148e.f12916e = (int) jArr2[i3];
            c6148e.f12915e = -2;
            c6148e.vip(0, true, bArr2);
            byte[] bArr3 = new byte[i4];
            c6148e.vip(0, false, bArr3);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z2 = i2 >= i5 + (-1) ? jArr2[i2] == ((long) c16849eArr[i2].license()) : jArr2[i2] == ((long) (c16849eArr[i2].license() - 1));
            if (!Arrays.equals(bArr, AbstractC12442e.license(c16849eArr[i2].f33017e)) || !Arrays.equals(bArr2, AbstractC12442e.license(c16849eArr[i2].f33023e))) {
                C16849e metrica = AbstractC0258e.metrica(((C16849e) list.get(i2)).f33015e, ((C16849e) list.get(i2)).f33020e, (int) jArr2[i2], bArr, bArr2);
                c16849eArr[i2] = metrica;
                c12968eArr[i3] = AbstractC0258e.license(c16849eArr[i3], metrica.purchase().vip());
            } else if (z2) {
                i2++;
                size = i5;
                jArr = jArr2;
            } else {
                c16849eArr[i2] = AbstractC0258e.metrica(((C16849e) list.get(i2)).f33015e, ((C16849e) list.get(i2)).f33020e, (int) jArr2[i2], bArr, bArr2);
            }
            z = true;
            i2++;
            size = i5;
            jArr = jArr2;
        }
        if (z) {
            metrica(c16849eArr, c12968eArr);
        }
    }

    public static C1347e vip(Object obj) {
        Throwable th;
        if (obj instanceof C1347e) {
            return (C1347e) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int readInt = dataInputStream.readInt();
            long readLong = dataInputStream.readLong();
            long readLong2 = dataInputStream.readLong();
            boolean readBoolean = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C16849e.appmetrica(obj));
            }
            for (int i2 = 0; i2 < readInt - 1; i2++) {
                arrayList2.add(C12968e.ad(obj));
            }
            return new C1347e(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return vip(AbstractC9460e.metrica((InputStream) obj));
            }
            throw new IllegalArgumentException(AbstractC1634e.advert(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                try {
                    C1347e vip = vip(dataInputStream3);
                    dataInputStream3.close();
                    return vip;
                } catch (Exception unused) {
                    C1347e c1347e = new C1347e(C16849e.appmetrica(obj), r4.license(), r4.f33014e);
                    dataInputStream3.close();
                    return c1347e;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th;
                }
                dataInputStream2.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final synchronized long ad() {
        return this.f4142e;
    }

    public final Object clone() {
        try {
            return vip(getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1347e.class != obj.getClass()) {
            return false;
        }
        C1347e c1347e = (C1347e) obj;
        if (this.f4140e == c1347e.f4140e && this.f4139e == c1347e.f4139e && this.f4143e == c1347e.f4143e && this.f4142e == c1347e.f4142e && this.f4141e.equals(c1347e.f4141e)) {
            return this.f4138e.equals(c1347e.f4138e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3928e
    public final synchronized byte[] getEncoded() {
        C15816e c15816e;
        try {
            c15816e = new C15816e(6);
            c15816e.m4013case(0);
            c15816e.m4013case(this.f4140e);
            long j = this.f4142e;
            c15816e.m4013case((int) (j >>> 32));
            c15816e.m4013case((int) j);
            long j2 = this.f4143e;
            c15816e.m4013case((int) (j2 >>> 32));
            c15816e.m4013case((int) j2);
            ((ByteArrayOutputStream) c15816e.f31190e).write(this.f4139e ? 1 : 0);
            Iterator it = this.f4141e.iterator();
            while (it.hasNext()) {
                c15816e.loadAd((C16849e) it.next());
            }
            Iterator it2 = this.f4138e.iterator();
            while (it2.hasNext()) {
                c15816e.loadAd((C12968e) it2.next());
            }
        } catch (Throwable th) {
            throw th;
        }
        return ((ByteArrayOutputStream) c15816e.f31190e).toByteArray();
    }

    public final int hashCode() {
        int hashCode = (this.f4138e.hashCode() + ((this.f4141e.hashCode() + (((this.f4140e * 31) + (this.f4139e ? 1 : 0)) * 31)) * 31)) * 31;
        long j = this.f4143e;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f4142e;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void metrica(C16849e[] c16849eArr, C12968e[] c12968eArr) {
        synchronized (this) {
            this.f4141e = DesugarCollections.unmodifiableList(Arrays.asList(c16849eArr));
            this.f4138e = DesugarCollections.unmodifiableList(Arrays.asList(c12968eArr));
        }
    }
}
