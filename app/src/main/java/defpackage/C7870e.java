package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7870e implements Closeable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f15923e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f15924e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ByteBuffer f15925e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ReadableByteChannel f15926e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f15927e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public ArrayList f15928e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ReadableByteChannel f15929e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public HashMap f15930e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f15931e;

    /* JADX WARN: Type inference failed for: r3v4, types: [eًِؐ, java.lang.Object] */
    public static C7870e license(C5790e c5790e) {
        C14072e premium;
        C10312e c10312e = new C10312e(2, false);
        c10312e.f20361e = c5790e;
        c10312e.f20360e = new HashMap();
        ByteBuffer byteBuffer = c5790e.f12240e;
        long position = byteBuffer.position();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            if ((hashSet.size() == 0 || i < hashSet.size() * 500) && (premium = C10312e.premium(c5790e)) != null) {
                int i2 = premium.f27819e;
                ByteBuffer byteBuffer2 = premium.f27820e;
                if (byteBuffer2 != null && !hashSet.contains(Integer.valueOf(i2)) && (byteBuffer2.duplicate().getInt() & (-256)) == 256) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i++;
            }
        }
        byteBuffer.position((int) position);
        c5790e.f12238e = Math.max(c5790e.f12238e, byteBuffer.position());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.getClass();
            ((HashMap) c10312e.f20360e).put(num, new C12240e(c10312e));
        }
        byteBuffer.position((int) 0);
        c5790e.f12238e = Math.max(c5790e.f12238e, byteBuffer.position());
        Set<Integer> keySet = ((HashMap) c10312e.f20360e).keySet();
        if (keySet.size() == 0) {
            throw new IllegalStateException("The MPEG TS stream contains no programs");
        }
        C7870e c7870e = null;
        for (Integer num2 : keySet) {
            num2.getClass();
            ReadableByteChannel readableByteChannel = (ReadableByteChannel) ((HashMap) c10312e.f20360e).get(num2);
            if (c7870e != null) {
                readableByteChannel.close();
            } else {
                ?? obj = new Object();
                obj.f15929e = readableByteChannel;
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position();
                while (readableByteChannel.read(allocate) != -1 && allocate.hasRemaining()) {
                }
                allocate.position();
                allocate.flip();
                obj.f15925e = allocate;
                obj.f15923e = allocate.remaining();
                obj.f15924e = obj.f15925e.getInt();
                obj.f15931e = 4;
                HashMap hashMap = new HashMap();
                obj.f15930e = hashMap;
                obj.f15926e = readableByteChannel;
                obj.f15928e = new ArrayList();
                int i3 = 0;
                while (true) {
                    if (i3 != 0 && (i3 >= hashMap.size() * 5 || hashMap.size() >= 2)) {
                        break;
                    }
                    C8560e loadAd = obj.loadAd(obj.advert());
                    if (loadAd == null) {
                        break;
                    }
                    obj.ad(loadAd);
                    i3++;
                }
                if (obj.purchase().size() > 0) {
                    c7870e = obj;
                } else {
                    readableByteChannel.close();
                }
            }
        }
        return c7870e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r3 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Signature(java.nio.ByteBuffer r13) {
        /*
            r12 = this;
            boolean r0 = r12.f15927e
            r1 = 0
            r2 = 1
            r3 = 3
            r4 = 2
            if (r0 == 0) goto La
            goto Lbb
        La:
            int r0 = r12.f15924e
            r5 = 511(0x1ff, float:7.16E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r0 < r6) goto L16
            if (r0 > r5) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            int r7 = r13.position()
        L1b:
            java.nio.ByteBuffer r8 = r12.f15925e
            boolean r8 = r8.hasRemaining()
            if (r8 == 0) goto L51
            int r8 = r12.f15924e
            if (r8 < r6) goto L30
            if (r8 > r5) goto L30
            if (r0 != 0) goto L2e
        L2b:
            r3 = r4
            goto Lbb
        L2e:
            int r0 = r0 + (-1)
        L30:
            boolean r8 = r13.hasRemaining()
            if (r8 != 0) goto L39
        L36:
            r3 = r2
            goto Lbb
        L39:
            int r8 = r12.f15924e
            int r8 = r8 >>> 24
            byte r8 = (byte) r8
            r13.put(r8)
            int r8 = r12.f15924e
            int r8 = r8 << 8
            java.nio.ByteBuffer r9 = r12.f15925e
            byte r9 = r9.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            r12.f15924e = r8
            goto L1b
        L51:
            java.nio.channels.ReadableByteChannel r8 = r12.f15929e
            r9 = 4096(0x1000, float:5.74E-42)
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r9)
            r9.position()
        L5c:
            int r10 = r8.read(r9)
            r11 = -1
            if (r10 == r11) goto L6a
            boolean r10 = r9.hasRemaining()
            if (r10 == 0) goto L6a
            goto L5c
        L6a:
            r9.position()
            r9.flip()
            r12.f15925e = r9
            long r10 = r12.f15923e
            int r8 = r9.remaining()
            long r8 = (long) r8
            long r10 = r10 + r8
            r12.f15923e = r10
            java.nio.ByteBuffer r8 = r12.f15925e
            boolean r8 = r8.hasRemaining()
            if (r8 != 0) goto L1b
            int r0 = r13.position()
            int r0 = r0 - r7
            if (r0 <= 0) goto L92
            int r0 = r12.f15924e
            if (r0 < r6) goto L92
            if (r0 > r5) goto L92
            goto L2b
        L92:
            int r0 = r12.f15931e
            if (r0 <= 0) goto Lb5
            boolean r0 = r13.hasRemaining()
            if (r0 == 0) goto Lb5
            int r0 = r12.f15924e
            int r0 = r0 >>> 24
            byte r0 = (byte) r0
            r13.put(r0)
            int r0 = r12.f15924e
            int r0 = r0 << 8
            r12.f15924e = r0
            int r7 = r12.f15931e
            int r7 = r7 - r2
            r12.f15931e = r7
            if (r0 < r6) goto L92
            if (r0 > r5) goto L92
            goto L2b
        Lb5:
            int r13 = r12.f15931e
            if (r13 != 0) goto L36
            r12.f15927e = r2
        Lbb:
            if (r3 == r2) goto Lc1
            if (r3 != r4) goto Lc0
            return r2
        Lc0:
            return r1
        Lc1:
            java.nio.BufferOverflowException r13 = new java.nio.BufferOverflowException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7870e.Signature(java.nio.ByteBuffer):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eُؚٚ] */
    public final void ad(C8560e c8560e) {
        HashMap hashMap = this.f15930e;
        int i = c8560e.metrica;
        C7263e c7263e = (C7263e) hashMap.get(Integer.valueOf(i));
        if (c7263e == null) {
            ?? obj = new Object();
            ArrayList arrayList = new ArrayList();
            obj.vip = arrayList;
            obj.metrica = this;
            obj.ad = i;
            arrayList.add(c8560e);
            hashMap.put(Integer.valueOf(i), obj);
            return;
        }
        ArrayList arrayList2 = c7263e.vip;
        if (arrayList2 != null) {
            arrayList2.add(c8560e);
            return;
        }
        C7870e c7870e = c7263e.metrica;
        ByteBuffer byteBuffer = c8560e.ad;
        c7870e.getClass();
        byteBuffer.clear();
        synchronized (c7870e.f15928e) {
            c7870e.f15928e.add(byteBuffer);
        }
    }

    public final ByteBuffer advert() {
        synchronized (this.f15928e) {
            try {
                if (this.f15928e.size() <= 0) {
                    return ByteBuffer.allocate(65536);
                }
                return (ByteBuffer) this.f15928e.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15926e.close();
    }

    public final C8560e loadAd(ByteBuffer byteBuffer) {
        int i;
        C8560e c8560e;
        ReadableByteChannel readableByteChannel = this.f15929e;
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (true) {
            int i2 = this.f15924e;
            if (i2 >= 445 && i2 <= 495) {
                ByteBuffer duplicate2 = duplicate.duplicate();
                Signature(duplicate);
                this.f15925e.remaining();
                int i3 = duplicate2.getInt() & 255;
                int i4 = duplicate2.getShort() & 65535;
                long j = -1;
                if (i3 != 191) {
                    byte b = duplicate2.get();
                    int i5 = b & 255;
                    i = 4096;
                    if ((b & 192) == 128) {
                        byte b2 = duplicate2.get();
                        int i6 = duplicate2.get() & 255;
                        int i7 = b2 & 192;
                        if (i7 == 128) {
                            j = AbstractC12731e.appmetrica(duplicate2);
                            AbstractC2835e.metrica(i6 - 5, duplicate2);
                        } else if (i7 == 192) {
                            j = AbstractC12731e.appmetrica(duplicate2);
                            AbstractC12731e.appmetrica(duplicate2);
                            AbstractC2835e.metrica(i6 - 10, duplicate2);
                        } else {
                            AbstractC2835e.metrica(i6, duplicate2);
                        }
                        c8560e = new C8560e(i3, j, i4);
                    } else {
                        while (i5 == 255) {
                            i5 = duplicate2.get() & 255;
                        }
                        if ((i5 & 192) == 64) {
                            duplicate2.get();
                            i5 = duplicate2.get() & 255;
                        }
                        int i8 = i5 & 240;
                        if (i8 == 32) {
                            j = AbstractC12731e.ad(i5, duplicate2);
                        } else if (i8 == 48) {
                            j = AbstractC12731e.ad(i5, duplicate2);
                            AbstractC12731e.appmetrica(duplicate2);
                        } else if (i5 != 15) {
                            throw new RuntimeException("Invalid data");
                        }
                        c8560e = new C8560e(i3, j, i4);
                    }
                } else {
                    i = 4096;
                    c8560e = new C8560e(i3, -1L, i4);
                }
                int i9 = c8560e.license;
                if (i9 != 0) {
                    int position = (i9 - duplicate.position()) + 6;
                    if (!this.f15927e) {
                        while (true) {
                            if (this.f15925e.hasRemaining()) {
                                int i10 = position - 1;
                                if (position == 0) {
                                    break;
                                }
                                duplicate.put((byte) (this.f15924e >>> 24));
                                this.f15924e = (this.f15924e << 8) | (this.f15925e.get() & 255);
                                position = i10;
                            } else {
                                ByteBuffer allocate = ByteBuffer.allocate(i);
                                allocate.position();
                                while (readableByteChannel.read(allocate) != -1 && allocate.hasRemaining()) {
                                }
                                allocate.position();
                                allocate.flip();
                                this.f15925e = allocate;
                                this.f15923e += allocate.remaining();
                                if (!this.f15925e.hasRemaining()) {
                                    duplicate.putInt(this.f15924e);
                                    this.f15927e = true;
                                    break;
                                }
                            }
                        }
                    }
                    duplicate2.limit(duplicate.position());
                    c8560e.ad = duplicate2;
                    return c8560e;
                }
                do {
                    int i11 = this.f15924e;
                    if (i11 >= 445 && i11 <= 495) {
                        break;
                    }
                } while (Signature(duplicate));
                duplicate2.limit(duplicate.position());
                c8560e.ad = duplicate2;
                return c8560e;
            }
            if (this.f15927e) {
                return null;
            }
            while (true) {
                if (this.f15925e.hasRemaining()) {
                    int i12 = (this.f15924e << 8) | (this.f15925e.get() & 255);
                    this.f15924e = i12;
                    if (i12 >= 256 && i12 <= 511) {
                        break;
                    }
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4096);
                    allocate2.position();
                    while (readableByteChannel.read(allocate2) != -1 && allocate2.hasRemaining()) {
                    }
                    allocate2.position();
                    allocate2.flip();
                    this.f15925e = allocate2;
                    this.f15923e += allocate2.remaining();
                    if (!this.f15925e.hasRemaining()) {
                        this.f15927e = true;
                        return null;
                    }
                }
            }
        }
    }

    public final ArrayList purchase() {
        ArrayList arrayList = new ArrayList();
        for (C7263e c7263e : this.f15930e.values()) {
            int i = c7263e.ad;
            if ((i >= 192 && i <= 223) || i == 189 || i == 191) {
                arrayList.add(c7263e);
            }
        }
        return arrayList;
    }
}
