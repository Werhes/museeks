package defpackage;

import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13906e {
    public static final C18256e appmetrica = new Object();
    public final List ad;
    public final C18075e license;
    public final SparseBooleanArray metrica = new SparseBooleanArray();
    public final C2271e vip = new C17519e(0);

    /* JADX WARN: Type inference failed for: r6v2, types: [eٕ٘ؔ, eؓۨۖ] */
    public C13906e(ArrayList arrayList, List list) {
        this.ad = list;
        int size = list.size();
        int i = RecyclerView.UNDEFINED_DURATION;
        C18075e c18075e = null;
        for (int i2 = 0; i2 < size; i2++) {
            C18075e c18075e2 = (C18075e) list.get(i2);
            int i3 = c18075e2.appmetrica;
            if (i3 > i) {
                c18075e = c18075e2;
                i = i3;
            }
        }
        this.license = c18075e;
    }
}
