package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8868e extends IOException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f17826e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٞۦ, java.io.IOException] */
    public static C8868e ad() {
        return new IOException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٞۦ, java.io.IOException] */
    public static C8868e appmetrica() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٞۦ, java.io.IOException] */
    public static C8868e billing() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٞۦ, java.io.IOException] */
    public static C8868e license() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَٞٚ, java.io.IOException] */
    public static C10416e metrica() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٞۦ, java.io.IOException] */
    public static C8868e purchase() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٞۦ, java.io.IOException] */
    public static C8868e vip() {
        return new IOException("Protocol message had invalid UTF-8.");
    }
}
