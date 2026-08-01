package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8756e extends C14142e {

    /* renamed from: abstract, reason: not valid java name */
    public final SparseArray f17653abstract;

    /* renamed from: break, reason: not valid java name */
    public final boolean f17654break;

    /* renamed from: default, reason: not valid java name */
    public final SparseBooleanArray f17655default;

    /* renamed from: extends, reason: not valid java name */
    public final boolean f17656extends;

    /* renamed from: native, reason: not valid java name */
    public final boolean f17657native;

    /* renamed from: protected, reason: not valid java name */
    public final boolean f17658protected;

    /* renamed from: throw, reason: not valid java name */
    public final boolean f17659throw;

    /* renamed from: try, reason: not valid java name */
    public final boolean f17660try;

    /* renamed from: while, reason: not valid java name */
    public final boolean f17661while;

    public C8756e() {
        this.f17653abstract = new SparseArray();
        this.f17655default = new SparseBooleanArray();
        this.f17657native = true;
        this.f17656extends = true;
        this.f17659throw = true;
        this.f17661while = true;
        this.f17660try = true;
        this.f17658protected = true;
        this.f17654break = true;
    }

    public C8756e(C16672e c16672e) {
        license(c16672e);
        this.f17657native = c16672e.f32714e;
        this.f17656extends = c16672e.f32711e;
        this.f17659throw = c16672e.f32717e;
        this.f17661while = c16672e.f32718e;
        this.f17660try = c16672e.f32712e;
        this.f17658protected = c16672e.f32713e;
        this.f17654break = c16672e.f32716e;
        SparseArray sparseArray = c16672e.f32710e;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f17653abstract = sparseArray2;
        this.f17655default = c16672e.f32715e.clone();
    }

    @Override // defpackage.C14142e
    public final void ad(C11680e c11680e) {
        this.f27969goto.put(c11680e.ad, c11680e);
    }

    @Override // defpackage.C14142e
    public final C14142e metrica() {
        super.metrica();
        return this;
    }

    @Override // defpackage.C14142e
    public final C4491e vip() {
        return new C16672e(this);
    }
}
