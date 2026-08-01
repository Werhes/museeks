package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16873e extends RuntimeException {
    public C16873e() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, eٌُٜ] */
    public final C10895e ad() {
        return new IOException(getMessage());
    }
}
