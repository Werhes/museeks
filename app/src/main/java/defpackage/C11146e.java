package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11146e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ByteBuffer f22355e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public byte f22356e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public byte f22357e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C3967e f22358e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f22359e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13033e f22360e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f22361e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f22362e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public /* synthetic */ Object f22363e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public CRC32 f22364e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public short f22365e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C3967e f22366e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Inflater f22367e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public ByteBuffer f22368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11146e(boolean z, InterfaceC13033e interfaceC13033e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22361e = z;
        this.f22360e = interfaceC13033e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C11146e c11146e = new C11146e(this.f22361e, this.f22360e, interfaceC5083e);
        c11146e.f22363e = obj;
        return c11146e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11146e) advert((InterfaceC5083e) obj2, (C9248e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00e1, code lost:
    
        if (r2 == r8) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0190, code lost:
    
        if (defpackage.AbstractC11263e.startapp(r7, 2, r18) == r8) goto L90;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x026d A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0028, B:10:0x028c, B:11:0x0267, B:13:0x026d, B:18:0x02a5, B:20:0x02ad, B:22:0x02cd, B:27:0x02d2, B:28:0x02f6, B:29:0x02f7, B:30:0x02fe, B:31:0x02ff, B:32:0x0322, B:33:0x0323, B:35:0x0337, B:36:0x033e, B:43:0x020c, B:45:0x0212, B:47:0x0218, B:50:0x0258, B:51:0x01d3, B:53:0x01d9, B:56:0x01f2, B:58:0x01fa, B:59:0x025d, B:61:0x0263, B:62:0x033f, B:73:0x0057, B:77:0x01cc), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0212 A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0028, B:10:0x028c, B:11:0x0267, B:13:0x026d, B:18:0x02a5, B:20:0x02ad, B:22:0x02cd, B:27:0x02d2, B:28:0x02f6, B:29:0x02f7, B:30:0x02fe, B:31:0x02ff, B:32:0x0322, B:33:0x0323, B:35:0x0337, B:36:0x033e, B:43:0x020c, B:45:0x0212, B:47:0x0218, B:50:0x0258, B:51:0x01d3, B:53:0x01d9, B:56:0x01f2, B:58:0x01fa, B:59:0x025d, B:61:0x0263, B:62:0x033f, B:73:0x0057, B:77:0x01cc), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9 A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0028, B:10:0x028c, B:11:0x0267, B:13:0x026d, B:18:0x02a5, B:20:0x02ad, B:22:0x02cd, B:27:0x02d2, B:28:0x02f6, B:29:0x02f7, B:30:0x02fe, B:31:0x02ff, B:32:0x0322, B:33:0x0323, B:35:0x0337, B:36:0x033e, B:43:0x020c, B:45:0x0212, B:47:0x0218, B:50:0x0258, B:51:0x01d3, B:53:0x01d9, B:56:0x01f2, B:58:0x01fa, B:59:0x025d, B:61:0x0263, B:62:0x033f, B:73:0x0057, B:77:0x01cc), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fa A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0028, B:10:0x028c, B:11:0x0267, B:13:0x026d, B:18:0x02a5, B:20:0x02ad, B:22:0x02cd, B:27:0x02d2, B:28:0x02f6, B:29:0x02f7, B:30:0x02fe, B:31:0x02ff, B:32:0x0322, B:33:0x0323, B:35:0x0337, B:36:0x033e, B:43:0x020c, B:45:0x0212, B:47:0x0218, B:50:0x0258, B:51:0x01d3, B:53:0x01d9, B:56:0x01f2, B:58:0x01fa, B:59:0x025d, B:61:0x0263, B:62:0x033f, B:73:0x0057, B:77:0x01cc), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025d A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:8:0x0028, B:10:0x028c, B:11:0x0267, B:13:0x026d, B:18:0x02a5, B:20:0x02ad, B:22:0x02cd, B:27:0x02d2, B:28:0x02f6, B:29:0x02f7, B:30:0x02fe, B:31:0x02ff, B:32:0x0322, B:33:0x0323, B:35:0x0337, B:36:0x033e, B:43:0x020c, B:45:0x0212, B:47:0x0218, B:50:0x0258, B:51:0x01d3, B:53:0x01d9, B:56:0x01f2, B:58:0x01fa, B:59:0x025d, B:61:0x0263, B:62:0x033f, B:73:0x0057, B:77:0x01cc), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x028b -> B:10:0x028c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0236 -> B:41:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01f8 -> B:51:0x01d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01fa -> B:43:0x020c). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11146e.loadAd(java.lang.Object):java.lang.Object");
    }
}
