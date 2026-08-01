package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9820e extends AbstractC9936e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public Function1 f19376e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public Function1 f19377e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public InterfaceC10153e f19378e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final View f19379e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public Function1 f19380e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C10663e f19381e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9820e(android.content.Context r8, kotlin.jvm.functions.Function1 r9, defpackage.AbstractC5830e r10, defpackage.InterfaceC5039e r11, int r12, defpackage.InterfaceC16590e r13) {
        /*
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            eَۦؕ r4 = new eَۦؕ
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.f19379e = r5
            r0.f19381e = r4
            r8 = 0
            r7.setClipChildren(r8)
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r9 = 0
            if (r11 == 0) goto L28
            java.lang.Object r10 = r11.appmetrica(r8)
            goto L29
        L28:
            r10 = r9
        L29:
            boolean r12 = r10 instanceof android.util.SparseArray
            if (r12 == 0) goto L30
            r9 = r10
            android.util.SparseArray r9 = (android.util.SparseArray) r9
        L30:
            if (r9 == 0) goto L35
            r5.restoreHierarchyState(r9)
        L35:
            if (r11 == 0) goto L44
            eؙۦَ r9 = new eؙۦَ
            r10 = 2
            r9.<init>(r7, r10)
            eٌَؚ r8 = r11.purchase(r8, r9)
            r7.setSavableRegistryEntry(r8)
        L44:
            eؘّؖ r8 = defpackage.C5430e.f11641e
            r0.f19377e = r8
            r0.f19380e = r8
            r0.f19376e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9820e.<init>(android.content.Context, kotlin.jvm.functions.Function1, eؘۖۨ, eؗٝ٘, int, eٖۢۨ):void");
    }

    public static final void amazon(C9820e c9820e) {
        c9820e.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC10153e interfaceC10153e) {
        InterfaceC10153e interfaceC10153e2 = this.f19378e;
        if (interfaceC10153e2 != null) {
            ((C15024e) interfaceC10153e2).ads();
        }
        this.f19378e = interfaceC10153e;
    }

    public final C10663e getDispatcher() {
        return this.f19381e;
    }

    public final Function1<View, Unit> getReleaseBlock() {
        return this.f19376e;
    }

    public final Function1<View, Unit> getResetBlock() {
        return this.f19380e;
    }

    public /* bridge */ /* synthetic */ AbstractC5133e getSubCompositionView() {
        return null;
    }

    public final Function1<View, Unit> getUpdateBlock() {
        return this.f19377e;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.f19376e = function1;
        setRelease(new C6788e(this, 3));
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.f19380e = function1;
        setReset(new C6788e(this, 4));
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.f19377e = function1;
        setUpdate(new C6788e(this, 5));
    }
}
