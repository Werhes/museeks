package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2847e extends AbstractC6080e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2847e f6814e = new C2847e(0, new Object[0]);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final transient Object[] f6815e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient int f6816e;

    public C2847e(int i, Object[] objArr) {
        this.f6815e = objArr;
        this.f6816e = i;
    }

    @Override // defpackage.AbstractC6080e, defpackage.AbstractC10967e
    public final int appmetrica(Object[] objArr) {
        Object[] objArr2 = this.f6815e;
        int i = this.f6816e;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC10967e
    public final int billing() {
        return this.f6816e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC7023e.smaato(i, this.f6816e);
        Object obj = this.f6815e[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6816e;
    }

    @Override // defpackage.AbstractC10967e
    public final Object[] startapp() {
        return this.f6815e;
    }

    @Override // defpackage.AbstractC10967e
    public final int yandex() {
        return 0;
    }
}
