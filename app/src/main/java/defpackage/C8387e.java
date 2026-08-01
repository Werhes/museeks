package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8387e implements InterfaceC2537e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f17155e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f17156e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f17157e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f17158e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC4895e f17159e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17160e;

    public C8387e(InterfaceC4895e interfaceC4895e) {
        this.f17159e = interfaceC4895e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.InterfaceC2537e
    public final long signatures(C16151e c16151e, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.f17155e;
            InterfaceC4895e interfaceC4895e = this.f17159e;
            if (i2 == 0) {
                interfaceC4895e.skip(this.f17160e);
                this.f17160e = 0;
                if ((this.f17156e & 4) == 0) {
                    i = this.f17158e;
                    int smaato = AbstractC10220e.smaato(interfaceC4895e);
                    this.f17155e = smaato;
                    this.f17157e = smaato;
                    int readByte = interfaceC4895e.readByte() & 255;
                    this.f17156e = interfaceC4895e.readByte() & 255;
                    Logger logger = C14177e.f28020e;
                    if (logger.isLoggable(Level.FINE)) {
                        C0193e c0193e = AbstractC17432e.ad;
                        logger.fine(AbstractC17432e.vip(true, this.f17158e, this.f17157e, readByte, this.f17156e));
                    }
                    readInt = interfaceC4895e.readInt() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.f17158e = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long signatures = interfaceC4895e.signatures(c16151e, Math.min(j, i2));
                if (signatures != -1) {
                    this.f17155e -= (int) signatures;
                    return signatures;
                }
            }
            return -1L;
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.InterfaceC2537e
    public final C1930e startapp() {
        return this.f17159e.startapp();
    }
}
