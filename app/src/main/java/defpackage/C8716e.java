package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8716e extends CancellationException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f17581e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f17582e;

    public C8716e(String str, int i) {
        super(str);
        this.f17582e = str;
        this.f17581e = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f17582e;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutCancellationException(");
        sb.append(this.f17582e);
        sb.append(", ");
        return AbstractC1786e.pro(sb, this.f17581e, ')');
    }
}
