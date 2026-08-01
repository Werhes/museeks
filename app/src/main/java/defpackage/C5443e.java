package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5443e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ArrayList f11708e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public /* synthetic */ Object f11709e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f11710e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f11711e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ C10709e f11712e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final /* synthetic */ C11467e f11713e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C8823e f11714e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ C8823e f11715e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final /* synthetic */ C6799e f11716e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC16859e f11717e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f11718e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Collection f11719e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Iterator f11720e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Collection f11721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5443e(C10709e c10709e, C8823e c8823e, C6799e c6799e, C8823e c8823e2, C11467e c11467e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        this.f11712e = c10709e;
        this.f11715e = c8823e;
        this.f11716e = c6799e;
        this.f11714e = c8823e2;
        this.f11713e = c11467e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        C5443e c5443e = new C5443e(this.f11712e, this.f11715e, this.f11716e, this.f11714e, this.f11713e, interfaceC5083e);
        c5443e.f11709e = obj;
        return c5443e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5443e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0201, code lost:
    
        if (defpackage.AbstractC12475e.vip(r2, r16) != r13) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ea A[LOOP:0: B:16:0x01e4->B:18:0x01ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b2 A[LOOP:1: B:25:0x01ac->B:27:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #1 {all -> 0x0059, blocks: (B:33:0x0050, B:38:0x00ef, B:40:0x00f5, B:43:0x0138, B:44:0x0147, B:46:0x014d, B:48:0x0165, B:50:0x016b, B:52:0x0179, B:54:0x0183, B:59:0x0187, B:74:0x006a, B:75:0x0070, B:77:0x0076, B:81:0x0089, B:82:0x0090, B:84:0x0091, B:85:0x00a0, B:87:0x00a6, B:89:0x00b9, B:90:0x00c6, B:92:0x00cc, B:94:0x00da), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #1 {all -> 0x0059, blocks: (B:33:0x0050, B:38:0x00ef, B:40:0x00f5, B:43:0x0138, B:44:0x0147, B:46:0x014d, B:48:0x0165, B:50:0x016b, B:52:0x0179, B:54:0x0183, B:59:0x0187, B:74:0x006a, B:75:0x0070, B:77:0x0076, B:81:0x0089, B:82:0x0090, B:84:0x0091, B:85:0x00a0, B:87:0x00a6, B:89:0x00b9, B:90:0x00c6, B:92:0x00cc, B:94:0x00da), top: B:2:0x0019 }] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0125 -> B:33:0x0127). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5443e.loadAd(java.lang.Object):java.lang.Object");
    }
}
