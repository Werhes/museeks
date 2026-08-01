package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8780e extends C14578e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC7185e f17685e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8780e(Function2 function2, InterfaceC8850e interfaceC8850e, int i, int i2) {
        super(function2, interfaceC8850e, i, i2);
        this.f17685e = (AbstractC7185e) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.C14578e, defpackage.AbstractC9910e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.InterfaceC9543e r5, defpackage.InterfaceC5083e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C13008e
            if (r0 == 0) goto L13
            r0 = r6
            eْؓۛ r0 = (defpackage.C13008e) r0
            int r1 = r0.f25932e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25932e = r1
            goto L1a
        L13:
            eْؓۛ r0 = new eْؓۛ
            eُؑ۠ r6 = (defpackage.AbstractC10731e) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f25930e
            int r1 = r0.f25932e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eٍٙٚ r5 = r0.f25931e
            defpackage.AbstractC2003e.purchase(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f25931e = r5
            r0.f25932e = r2
            java.lang.Object r6 = super.appmetrica(r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L41
            return r0
        L41:
            eًٟؔ r5 = (defpackage.C2448e) r5
            eٖٓٞ r5 = r5.f6257e
            boolean r5 = r5.subs()
            if (r5 == 0) goto L4e
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8780e.appmetrica(eٍٙٚ, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.C14578e, defpackage.AbstractC9910e
    public final AbstractC9910e billing(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return new C8780e(this.f17685e, interfaceC8850e, i, i2);
    }
}
