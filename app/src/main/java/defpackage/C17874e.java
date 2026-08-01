package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: eًٜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17874e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f35064e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f35065e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35066e;

    public C17874e(C15816e c15816e, C18013e c18013e, realm_value_t realm_value_tVar) {
        this.f35066e = 20;
        this.f35065e = c18013e;
        this.f35064e = realm_value_tVar;
    }

    public /* synthetic */ C17874e(Object obj, Object obj2, int i) {
        this.f35066e = i;
        this.f35065e = obj;
        this.f35064e = obj2;
    }

    private final Object ad(Object obj) {
        C5609e c5609e = (C5609e) this.f35065e;
        Object obj2 = c5609e.f11962e;
        C13578e c13578e = (C13578e) this.f35064e;
        synchronized (obj2) {
            ((ArrayList) c5609e.f11964e).remove(c13578e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0797, code lost:
    
        if (((defpackage.EnumC13937e) r0.f13645e) != defpackage.EnumC13937e.TYPE_PARAMETER_BOUNDS) goto L243;
     */
    /* JADX WARN: Type inference failed for: r8v7, types: [eٖؑٚ, eٖۥٌ] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 2098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17874e.invoke(java.lang.Object):java.lang.Object");
    }
}
