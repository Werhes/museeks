package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12118e {
    public final Context ad;
    public final BinderC8922e appmetrica;
    public final C12487e license;
    public final BinderC1109e metrica;
    public final String vip;

    public C12118e(Context context, C12487e c12487e, BinderC8922e binderC8922e) {
        String vip;
        ArrayList arrayList = c12487e.f25009e;
        String str = c12487e.f25017e;
        if (DesugarCollections.unmodifiableList(arrayList).isEmpty()) {
            vip = AbstractC9764e.billing(str);
        } else {
            List unmodifiableList = DesugarCollections.unmodifiableList(c12487e.f25009e);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            vip = new C9271e(str, unmodifiableList).vip();
        }
        this.metrica = new BinderC1109e(this);
        this.ad = context.getApplicationContext();
        AbstractC9528e.purchase(vip);
        this.vip = vip;
        this.license = c12487e;
        this.appmetrica = binderC8922e;
    }
}
