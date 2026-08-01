package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4726e extends RuntimeException {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C12452e f10113e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12328e f10114e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f10115e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12328e f10116e;

    public C4726e(C12328e c12328e, C12328e c12328e2, C12452e c12452e, int i, Exception exc) {
        super(exc);
        this.f10116e = c12328e;
        this.f10114e = c12328e2;
        this.f10113e = c12452e;
        this.f10115e = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.f10115e);
        sb.append(":\n            |");
        C4300e license = AbstractC16342e.license(new C12522e(this, null));
        if (license.hasNext()) {
            Object next = license.next();
            if (license.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (license.hasNext()) {
                    arrayList.add(license.next());
                }
                list = arrayList;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = C13664e.f27089e;
        }
        sb.append(AbstractC13480e.m3608try(AbstractC13480e.m3606throws(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return AbstractC17540e.appmetrica(sb.toString());
    }
}
