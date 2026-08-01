package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2341e extends AbstractC15107e {
    public final /* synthetic */ Matrix license;
    public final /* synthetic */ ArrayList metrica;

    public C2341e(ArrayList arrayList, Matrix matrix) {
        this.metrica = arrayList;
        this.license = matrix;
    }

    @Override // defpackage.AbstractC15107e
    public final void ad(Matrix matrix, C11224e c11224e, int i, Canvas canvas) {
        Iterator it = this.metrica.iterator();
        while (it.hasNext()) {
            ((AbstractC15107e) it.next()).ad(this.license, c11224e, i, canvas);
        }
    }
}
