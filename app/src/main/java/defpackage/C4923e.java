package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4923e extends InputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17430e f10423e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f10424e;

    public C4923e(Function0 function0, InterfaceC17430e interfaceC17430e) {
        this.f10424e = function0;
        this.f10423e = interfaceC17430e;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (((Boolean) this.f10424e.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        return (int) Math.min(this.f10423e.metrica().f24832e, Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10423e.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (((Boolean) this.f10424e.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        InterfaceC17430e interfaceC17430e = this.f10423e;
        if (interfaceC17430e.yandex()) {
            return -1;
        }
        return interfaceC17430e.readByte() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (((Boolean) this.f10424e.invoke()).booleanValue()) {
            throw new IOException("Underlying source is closed.");
        }
        AbstractC8913e.metrica(bArr.length, i, i2);
        return this.f10423e.mo1230e(i, i2 + i, bArr);
    }

    public final String toString() {
        return this.f10423e + ".asInputStream()";
    }
}
