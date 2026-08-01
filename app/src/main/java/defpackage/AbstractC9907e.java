package defpackage;

import java.io.InputStream;

/* renamed from: eٍۦٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9907e extends InputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19544e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InputStream f19545e;

    public AbstractC9907e(InputStream inputStream, int i) {
        this.f19545e = inputStream;
        this.f19544e = i;
    }

    public final void ad() {
        InputStream inputStream = this.f19545e;
        if (inputStream instanceof C3704e) {
            C3704e c3704e = (C3704e) inputStream;
            c3704e.f8292e = true;
            c3704e.license();
        }
    }
}
