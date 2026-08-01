package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15200e extends AbstractC1056e {
    public C16462e license;
    public C15305e metrica;

    @Override // defpackage.AbstractC1056e
    public final InterfaceC1425e appmetrica(FileChannel fileChannel, String str, boolean z) {
        C16462e c16462e = this.license;
        c16462e.getClass();
        C7936e c7936e = C16462e.vip;
        new C8563e(fileChannel, AbstractC10257e.adcel(str, " ")).ad();
        ArrayList arrayList = new ArrayList();
        C3095e c3095e = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (!z3) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            fileChannel.position();
            c7936e.getClass();
            int i = C1724e.ad;
            C0381e license = C0381e.license(fileChannel);
            int i2 = license.vip;
            EnumC17116e enumC17116e = (EnumC17116e) license.appmetrica;
            fileChannel.position();
            if (enumC17116e != null) {
                int ordinal = enumC17116e.ordinal();
                if (ordinal == 4) {
                    ByteBuffer allocate = ByteBuffer.allocate(i2);
                    fileChannel.read(allocate);
                    C3534e c3534e = c16462e.ad;
                    byte[] array = allocate.array();
                    c3534e.getClass();
                    c3095e = C3534e.ad(false, array);
                } else if (ordinal != 6) {
                    fileChannel.position(fileChannel.position() + i2);
                } else {
                    if (z) {
                        fileChannel.position(fileChannel.position() + i2);
                    } else {
                        try {
                            arrayList.add(new C8340e(license, fileChannel));
                        } catch (C14572e | IOException e) {
                            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                            e.getMessage();
                            int i3 = C1724e.ad;
                        }
                    }
                    z4 = true;
                }
            }
            z3 = license.metrica;
        }
        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
        AbstractC6069e.license(fileChannel.position());
        c7936e.getClass();
        int i4 = C1724e.ad;
        if (c3095e == null) {
            c3095e = C3095e.pro();
        }
        if (z4 && z) {
            z2 = true;
        }
        return new C15246e(c3095e, arrayList, z2);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eٞٙ, eؑۘۚ] */
    @Override // defpackage.AbstractC1056e
    public final C0521e license(FileChannel fileChannel, String str) {
        this.metrica.getClass();
        C7936e c7936e = C15305e.ad;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c7936e.getClass();
        int i = C1724e.ad;
        new C8563e(fileChannel, AbstractC10257e.adcel(str, " ")).ad();
        C0776e c0776e = null;
        boolean z = false;
        while (!z) {
            C0381e license = C0381e.license(fileChannel);
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            int i2 = C1724e.ad;
            if (((EnumC17116e) license.appmetrica) == EnumC17116e.STREAMINFO) {
                c0776e = new C0776e(license, fileChannel);
            } else {
                fileChannel.position(fileChannel.position() + license.vip);
            }
            z = license.metrica;
        }
        long position = fileChannel.position();
        if (c0776e == null) {
            throw new Exception(AbstractC10257e.adcel(str, ":Unable to find Flac StreamInfo"));
        }
        int i3 = c0776e.f3147e;
        float f = c0776e.f3140e;
        ?? c0521e = new C0521e();
        c0521e.advert = c0776e.f3145e;
        c0521e.mopub = f;
        c0521e.appmetrica = c0776e.f3142e;
        c0521e.purchase = c0776e.f3137e;
        c0521e.billing = i3;
        c0521e.yandex = AbstractC1634e.smaato("FLAC ", i3, " bits");
        c0521e.adcel = true;
        c0521e.amazon = c0776e.f3143e;
        c0521e.ad = fileChannel.size() - position;
        c0521e.vip = position;
        c0521e.metrica = fileChannel.size();
        long j = c0521e.ad;
        C7936e c7936e2 = AbstractC1983e.ad;
        c0521e.license = (int) (((float) ((j / 1000) * 8)) / f);
        return c0521e;
    }
}
