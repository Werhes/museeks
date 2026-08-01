package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC16348e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Map f32122e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f32123e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final URL f32124e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f32125e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32126e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Cpackage f32127e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f32128e;

    public RunnableC16348e(C4172e c4172e, String str, URL url, byte[] bArr, Map map, InterfaceC5000e interfaceC5000e) {
        Objects.requireNonNull(c4172e);
        this.f32127e = c4172e;
        AbstractC9528e.purchase(str);
        AbstractC9528e.startapp(url);
        this.f32124e = url;
        this.f32123e = bArr;
        this.f32128e = interfaceC5000e;
        this.f32125e = str;
        this.f32122e = map;
    }

    public RunnableC16348e(C16391e c16391e, String str, URL url, byte[] bArr, HashMap hashMap, InterfaceC17533e interfaceC17533e) {
        Objects.requireNonNull(c16391e);
        this.f32127e = c16391e;
        AbstractC9528e.purchase(str);
        this.f32124e = url;
        this.f32123e = bArr;
        this.f32128e = interfaceC17533e;
        this.f32125e = str;
        this.f32122e = hashMap;
    }

    public void ad(final int i, final IOException iOException, final byte[] bArr, final Map map) {
        C6915e c6915e = ((C6936e) ((C16391e) this.f32127e).f36443e).f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2254e(new Runnable() { // from class: eّۖٝ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC16348e runnableC16348e = RunnableC16348e.this;
                ((InterfaceC17533e) runnableC16348e.f32128e).appmetrica(runnableC16348e.f32125e, i, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:177:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:174:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC16348e.run():void");
    }
}
