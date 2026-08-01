package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۥٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6041e implements Cloneable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC15319e f12709e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC15319e f12710e;

    public AbstractC6041e(AbstractC15319e abstractC15319e) {
        this.f12710e = abstractC15319e;
        if (abstractC15319e.billing()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f12709e = abstractC15319e.startapp();
    }

    public static void ad(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    public final AbstractC15319e appmetrica() {
        AbstractC15319e license = license();
        license.getClass();
        if (AbstractC15319e.subscription(license, true)) {
            return license;
        }
        throw new C16873e();
    }

    public final void billing(byte[] bArr, int i, C17268e c17268e) {
        if (!this.f12709e.billing()) {
            AbstractC15319e startapp = this.f12710e.startapp();
            C5913e.metrica.ad(startapp.getClass()).vip(startapp, this.f12709e);
            this.f12709e = startapp;
        }
        try {
            C5913e.metrica.ad(this.f12709e.getClass()).purchase(this.f12709e, bArr, 0, i, new C6313e(c17268e));
        } catch (C10895e e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final AbstractC15319e license() {
        if (!this.f12709e.billing()) {
            return this.f12709e;
        }
        this.f12709e.adcel();
        return this.f12709e;
    }

    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    public final AbstractC6041e clone() {
        AbstractC6041e abstractC6041e = (AbstractC6041e) this.f12710e.pro(5);
        abstractC6041e.f12709e = license();
        return abstractC6041e;
    }

    public final void purchase(AbstractC15319e abstractC15319e) {
        AbstractC15319e abstractC15319e2 = this.f12710e;
        if (abstractC15319e2.equals(abstractC15319e)) {
            return;
        }
        if (!this.f12709e.billing()) {
            AbstractC15319e startapp = abstractC15319e2.startapp();
            C5913e.metrica.ad(startapp.getClass()).vip(startapp, this.f12709e);
            this.f12709e = startapp;
        }
        AbstractC15319e abstractC15319e3 = this.f12709e;
        C5913e.metrica.ad(abstractC15319e3.getClass()).vip(abstractC15319e3, abstractC15319e);
    }

    public final void vip() {
        if (this.f12709e.billing()) {
            return;
        }
        AbstractC15319e startapp = this.f12710e.startapp();
        C5913e.metrica.ad(startapp.getClass()).vip(startapp, this.f12709e);
        this.f12709e = startapp;
    }
}
