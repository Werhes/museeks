package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۘۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18334e extends AbstractC16377e {
    public final /* synthetic */ int metrica;

    public /* synthetic */ C18334e(int i) {
        this.metrica = i;
    }

    public final ByteBuffer adcel(InterfaceC1425e interfaceC1425e, int i) {
        switch (this.metrica) {
            case 0:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Iterator adcel = interfaceC1425e.adcel();
                    boolean z = false;
                    while (adcel.hasNext()) {
                        InterfaceC3589e interfaceC3589e = (InterfaceC3589e) adcel.next();
                        if (!(interfaceC3589e instanceof C18461e)) {
                            byteArrayOutputStream.write(interfaceC3589e.purchase());
                        } else if (!z) {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            C2171e listIterator = interfaceC1425e.metrica(EnumC8271e.COVER_ART).listIterator(0);
                            while (listIterator.hasNext()) {
                                byteArrayOutputStream2.write(((AbstractC8492e) ((InterfaceC3589e) listIterator.next())).license());
                            }
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream.write(AbstractC1983e.appmetrica(byteArray.length + 8));
                            byteArrayOutputStream.write(EnumC14687e.ARTWORK.f29091e.getBytes(AbstractC4639e.vip));
                            byteArrayOutputStream.write(byteArray);
                            z = true;
                        }
                    }
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    byteArrayOutputStream3.write(AbstractC1983e.appmetrica(byteArrayOutputStream.size() + 8));
                    EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
                    byteArrayOutputStream3.write("ilst".getBytes(AbstractC4639e.vip));
                    byteArrayOutputStream3.write(byteArrayOutputStream.toByteArray());
                    ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream3.toByteArray());
                    wrap.rewind();
                    return wrap;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            default:
                try {
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    C3095e c3095e = (C3095e) interfaceC1425e;
                    c3095e.getClass();
                    List admob = c3095e.admob(EnumC13303e.VENDOR.f26533e);
                    String interfaceC3589e2 = admob.size() != 0 ? ((InterfaceC3589e) admob.get(0)).toString() : BuildConfig.FLAVOR;
                    Charset charset = AbstractC4639e.metrica;
                    byteArrayOutputStream4.write(AbstractC1983e.purchase(interfaceC3589e2.getBytes(charset).length));
                    byteArrayOutputStream4.write(interfaceC3589e2.getBytes(charset));
                    byteArrayOutputStream4.write(AbstractC1983e.purchase(interfaceC1425e.license() - 1));
                    Iterator adcel2 = interfaceC1425e.adcel();
                    while (adcel2.hasNext()) {
                        InterfaceC3589e interfaceC3589e3 = (InterfaceC3589e) adcel2.next();
                        if (!interfaceC3589e3.getId().equals(EnumC13303e.VENDOR.f26533e)) {
                            byteArrayOutputStream4.write(interfaceC3589e3.purchase());
                        }
                    }
                    ByteBuffer wrap2 = ByteBuffer.wrap(byteArrayOutputStream4.toByteArray());
                    wrap2.rewind();
                    return wrap2;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}
