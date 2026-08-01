package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3728e implements InterfaceC2537e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final CRC32 f8306e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Inflater f8307e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13197e f8308e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C15532e f8309e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte f8310e;

    public C3728e(InterfaceC4895e interfaceC4895e) {
        C13197e c13197e = new C13197e(interfaceC4895e);
        this.f8308e = c13197e;
        Inflater inflater = new Inflater(true);
        this.f8307e = inflater;
        this.f8309e = new C15532e(c13197e, inflater);
        this.f8306e = new CRC32();
    }

    public static void ad(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, ": actual 0x");
        isPro.append(AbstractC5304e.m1850abstract(8, AbstractC7844e.loadAd(i2)));
        isPro.append(" != expected 0x");
        isPro.append(AbstractC5304e.m1850abstract(8, AbstractC7844e.loadAd(i)));
        throw new IOException(isPro.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8309e.close();
    }

    public final void license(long j, long j2, C16151e c16151e) {
        C16592e c16592e = c16151e.f31732e;
        while (true) {
            int i = c16592e.metrica;
            int i2 = c16592e.vip;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c16592e = c16592e.purchase;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c16592e.metrica - r5, j2);
            this.f8306e.update(c16592e.ad, (int) (c16592e.vip + j), min);
            j2 -= min;
            c16592e = c16592e.purchase;
            j = 0;
        }
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        C3728e c3728e = this;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = c3728e.f8310e;
        CRC32 crc32 = c3728e.f8306e;
        C13197e c13197e = c3728e.f8308e;
        if (b == 0) {
            c13197e.admob(10L);
            C16151e c16151e2 = c13197e.f26204e;
            byte Signature = c16151e2.Signature(3L);
            boolean z = ((Signature >> 1) & 1) == 1;
            if (z) {
                c3728e.license(0L, 10L, c16151e2);
            }
            ad(8075, c13197e.readShort(), "ID1ID2");
            c13197e.skip(8L);
            if (((Signature >> 2) & 1) == 1) {
                c13197e.admob(2L);
                if (z) {
                    license(0L, 2L, c16151e2);
                }
                long mo1681e = c16151e2.mo1681e() & 65535;
                c13197e.admob(mo1681e);
                if (z) {
                    license(0L, mo1681e, c16151e2);
                }
                c13197e.skip(mo1681e);
            }
            if (((Signature >> 3) & 1) == 1) {
                long ad = c13197e.ad((byte) 0, 0L, Long.MAX_VALUE);
                if (ad == -1) {
                    throw new EOFException();
                }
                if (z) {
                    license(0L, ad + 1, c16151e2);
                }
                c13197e.skip(ad + 1);
            }
            if (((Signature >> 4) & 1) == 1) {
                long ad2 = c13197e.ad((byte) 0, 0L, Long.MAX_VALUE);
                if (ad2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c3728e = this;
                    c3728e.license(0L, ad2 + 1, c16151e2);
                } else {
                    c3728e = this;
                }
                c13197e.skip(ad2 + 1);
            } else {
                c3728e = this;
            }
            if (z) {
                ad(c13197e.mo1681e(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c3728e.f8310e = (byte) 1;
        }
        if (c3728e.f8310e == 1) {
            long j2 = c16151e.f31731e;
            long signatures = c3728e.f8309e.signatures(c16151e, j);
            if (signatures != -1) {
                c3728e.license(j2, signatures, c16151e);
                return signatures;
            }
            c3728e.f8310e = (byte) 2;
        }
        if (c3728e.f8310e == 2) {
            ad(c13197e.mo1684finally(), (int) crc32.getValue(), "CRC");
            ad(c13197e.mo1684finally(), (int) c3728e.f8307e.getBytesWritten(), "ISIZE");
            c3728e.f8310e = (byte) 3;
            if (!c13197e.yandex()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f8308e.f26205e.startapp();
    }
}
