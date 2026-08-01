package defpackage;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4886e implements InterfaceC9089e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f10364e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f10365e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10366e;

    public C4886e(Choreographer choreographer, C4377e c4377e) {
        this.f10366e = 0;
        this.f10365e = choreographer;
        this.f10364e = c4377e;
    }

    public C4886e(InterfaceC9089e interfaceC9089e) {
        this.f10366e = 2;
        this.f10365e = interfaceC9089e;
        this.f10364e = new C5609e(6);
    }

    public C4886e(Function0 function0) {
        this.f10366e = 1;
        this.f10365e = function0;
        this.f10364e = new C18464e(3);
    }

    private final Object ad(Function1 function1, InterfaceC5083e interfaceC5083e) {
        C4377e c4377e = (C4377e) this.f10364e;
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(interfaceC5083e));
        c13578e.tapsense();
        ChoreographerFrameCallbackC8686e choreographerFrameCallbackC8686e = new ChoreographerFrameCallbackC8686e(c13578e, this, function1);
        if (AbstractC7890e.billing(c4377e.f9529e, (Choreographer) this.f10365e)) {
            synchronized (c4377e.f9527e) {
                try {
                    c4377e.f9535e.add(choreographerFrameCallbackC8686e);
                    if (!c4377e.f9530e) {
                        c4377e.f9530e = true;
                        c4377e.f9529e.postFrameCallback(c4377e.f9532e);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c13578e.inmobi(new C5337e(c4377e, choreographerFrameCallbackC8686e, 3));
        } else {
            ((Choreographer) this.f10365e).postFrameCallback(choreographerFrameCallbackC8686e);
            c13578e.inmobi(new C5337e(this, choreographerFrameCallbackC8686e, 4));
        }
        return c13578e.signatures();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٗۘۛ, eٟؒ۟, java.lang.Object] */
    @Override // defpackage.InterfaceC9089e
    /* renamed from: catch, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1675catch(kotlin.jvm.functions.Function1 r7, defpackage.InterfaceC5083e r8) {
        /*
            r6 = this;
            int r0 = r6.f10366e
            switch(r0) {
                case 0: goto Lc3;
                case 1: goto L92;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof defpackage.C2816e
            if (r0 == 0) goto L18
            r0 = r8
            eُؔۙ r0 = (defpackage.C2816e) r0
            int r1 = r0.f6767e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f6767e = r1
            goto L1d
        L18:
            eُؔۙ r0 = new eُؔۙ
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f6765e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f6767e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.AbstractC2003e.purchase(r8)
            goto L8e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.jvm.functions.Function1 r7 = r0.f6766e
            defpackage.AbstractC2003e.purchase(r8)
            goto L7e
        L3d:
            defpackage.AbstractC2003e.purchase(r8)
            java.lang.Object r8 = r6.f10364e
            eؘْؗ r8 = (defpackage.C5609e) r8
            r0.f6766e = r7
            r0.f6767e = r4
            boolean r2 = r8.amazon()
            if (r2 == 0) goto L51
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            goto L7b
        L51:
            eْۢ٘ r2 = new eْۢ٘
            eًؗۖ r5 = defpackage.AbstractC10558e.startapp(r0)
            r2.<init>(r4, r5)
            r2.tapsense()
            java.lang.Object r4 = r8.f11962e
            monitor-enter(r4)
            java.lang.Object r5 = r8.f11964e     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L8f
            r5.add(r2)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r4)
            eًٜ٘ r4 = new eًٜ٘
            r5 = 10
            r4.<init>(r8, r2, r5)
            r2.inmobi(r4)
            java.lang.Object r8 = r2.signatures()
            if (r8 != r1) goto L79
            goto L7b
        L79:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L7b:
            if (r8 != r1) goto L7e
            goto L8d
        L7e:
            java.lang.Object r8 = r6.f10365e
            eٌۤؕ r8 = (defpackage.InterfaceC9089e) r8
            r2 = 0
            r0.f6766e = r2
            r0.f6767e = r3
            java.lang.Object r8 = r8.mo1675catch(r7, r0)
            if (r8 != r1) goto L8e
        L8d:
            r8 = r1
        L8e:
            return r8
        L8f:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L92:
            eْۢ٘ r0 = new eْۢ٘
            eًؗۖ r8 = defpackage.AbstractC10558e.startapp(r8)
            r1 = 1
            r0.<init>(r1, r8)
            r0.tapsense()
            java.lang.Object r8 = r6.f10364e
            eۣۡ r8 = (defpackage.C18464e) r8
            eٗۘۛ r1 = new eٗۘۛ
            r1.<init>()
            r1.ad = r0
            r1.vip = r7
            java.lang.Object r7 = r6.f10365e
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            eٖؕٙ r7 = r8.m4519finally(r1, r7)
            eِٜ٘ r8 = new eِٜ٘
            r1 = 8
            r8.<init>(r1, r7)
            r0.inmobi(r8)
            java.lang.Object r7 = r0.signatures()
            return r7
        Lc3:
            java.lang.Object r7 = r6.ad(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4886e.mo1675catch(kotlin.jvm.functions.Function1, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        switch (this.f10366e) {
            case 0:
                return AbstractC5797e.vip(this, interfaceC8850e);
            case 1:
                return AbstractC5797e.vip(this, interfaceC8850e);
            default:
                return AbstractC5797e.vip(this, interfaceC8850e);
        }
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        switch (this.f10366e) {
            case 0:
                return function2.invoke(obj, this);
            case 1:
                return function2.invoke(obj, this);
            default:
                return function2.invoke(obj, this);
        }
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        switch (this.f10366e) {
            case 0:
                return AbstractC8769e.appmetrica(this, interfaceC1598e);
            case 1:
                return AbstractC8769e.appmetrica(this, interfaceC1598e);
            default:
                return AbstractC8769e.appmetrica(this, interfaceC1598e);
        }
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        switch (this.f10366e) {
            case 0:
                return C12575e.f25231e;
            case 1:
                return C12575e.f25231e;
            default:
                return C12575e.f25231e;
        }
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        switch (this.f10366e) {
            case 0:
                return AbstractC8769e.vip(this, interfaceC1598e);
            case 1:
                return AbstractC8769e.vip(this, interfaceC1598e);
            default:
                return AbstractC8769e.vip(this, interfaceC1598e);
        }
    }
}
