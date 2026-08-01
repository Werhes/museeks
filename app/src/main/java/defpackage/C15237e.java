package defpackage;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15237e extends AbstractC11130e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final HashMap f30141e = new HashMap();

    static {
        for (EnumC16730e enumC16730e : EnumC16730e.values()) {
            f30141e.put(enumC16730e.f32807e, enumC16730e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [eٍُٝ, eُٕؖ] */
    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public static C15237e m3924e() {
        EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
        C18529e c18529e = new C18529e("hdlr");
        c18529e.appmetrica(34);
        ByteBuffer allocate = ByteBuffer.allocate(26);
        allocate.put(8, (byte) 109);
        allocate.put(9, (byte) 100);
        allocate.put(10, (byte) 105);
        allocate.put(11, (byte) 114);
        allocate.put(12, (byte) 97);
        allocate.put(13, (byte) 112);
        allocate.put(14, (byte) 112);
        allocate.put(15, (byte) 108);
        allocate.rewind();
        ?? abstractC11130e = new AbstractC11130e(0, false);
        abstractC11130e.f22047e = c18529e;
        abstractC11130e.f22046e = allocate;
        return abstractC11130e;
    }

    @Override // defpackage.AbstractC11130e
    public final String toString() {
        throw null;
    }
}
