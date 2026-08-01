package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18278e extends AbstractC12098e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayDeque f35719e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15453e f35720e;

    public C18278e(C15453e c15453e) {
        this.f35720e = c15453e;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f35719e = arrayDeque;
        File file = (File) c15453e.license;
        if (file.isDirectory()) {
            arrayDeque.push(vip(file));
        } else if (file.isFile()) {
            arrayDeque.push(new AbstractC8071e(file));
        } else {
            this.f24255e = 2;
        }
    }

    @Override // defpackage.AbstractC12098e
    public final void ad() {
        File file;
        File ad;
        while (true) {
            ArrayDeque arrayDeque = this.f35719e;
            AbstractC8071e abstractC8071e = (AbstractC8071e) arrayDeque.peek();
            if (abstractC8071e == null) {
                file = null;
                break;
            }
            ad = abstractC8071e.ad();
            if (ad == null) {
                arrayDeque.pop();
            } else if (ad.equals(abstractC8071e.ad) || !ad.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(vip(ad));
            }
        }
        file = ad;
        if (file == null) {
            this.f24255e = 2;
        } else {
            this.f24254e = file;
            this.f24255e = 1;
        }
    }

    public final AbstractC9450e vip(File file) {
        int m2467class = AbstractC8703e.m2467class(this.f35720e.vip);
        if (m2467class == 0) {
            return new C15739e(this, file);
        }
        if (m2467class == 1) {
            return new C4080e(this, file);
        }
        throw new C14803e(10);
    }
}
