package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11690e extends IOException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f23521e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِِۧ, java.io.IOException] */
    public static C11690e ad() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِِۧ, java.io.IOException] */
    public static C11690e appmetrica() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِِۧ, java.io.IOException] */
    public static C11690e license() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِِۧ, java.io.IOException] */
    public static C11690e metrica() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, eؓ۟ٙ] */
    public static C2129e vip() {
        return new IOException("Protocol message tag had invalid wire type.");
    }
}
