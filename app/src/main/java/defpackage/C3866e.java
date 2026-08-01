package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3866e implements InterfaceC2747e {
    public final C15921e ad;

    public C3866e(C15921e c15921e) {
        this.ad = c15921e;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC16719e) list.get(0)).loadAd(i));
            int billing = AbstractC6874e.billing(list);
            int i2 = 1;
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC16719e) list.get(i2)).loadAd(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC16719e) list.get(0)).mo2529while(i));
            int billing = AbstractC6874e.billing(list);
            int i2 = 1;
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC16719e) list.get(i2)).mo2529while(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC16719e) list.get(0)).metrica(i));
            int billing = AbstractC6874e.billing(list);
            int i2 = 1;
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC16719e) list.get(i2)).metrica(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC16719e) list.get(0)).smaato(i));
            int billing = AbstractC6874e.billing(list);
            int i2 = 1;
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC16719e) list.get(i2)).smaato(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        AbstractC2832e abstractC2832e;
        int i;
        AbstractC2832e abstractC2832e2;
        int i2;
        int i3;
        int size = list.size();
        AbstractC2832e[] abstractC2832eArr = new AbstractC2832e[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            abstractC2832e = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            InterfaceC16719e interfaceC16719e = (InterfaceC16719e) list.get(i4);
            Object signatures = interfaceC16719e.signatures();
            C17708e c17708e = signatures instanceof C17708e ? (C17708e) signatures : null;
            if (c17708e != null && ((Boolean) c17708e.f34708e.getValue()).booleanValue()) {
                AbstractC2832e admob = interfaceC16719e.admob(j);
                Unit unit = Unit.INSTANCE;
                abstractC2832eArr[i4] = admob;
                j2 = (admob.f6804e & 4294967295L) | (admob.f6806e << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            InterfaceC16719e interfaceC16719e2 = (InterfaceC16719e) list.get(i5);
            if (abstractC2832eArr[i5] == null) {
                abstractC2832eArr[i5] = interfaceC16719e2.admob(j);
            }
        }
        if (interfaceC13158e.mo398transient()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                abstractC2832e2 = null;
            } else {
                abstractC2832e2 = abstractC2832eArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = abstractC2832e2 != null ? abstractC2832e2.f6806e : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            AbstractC2832e abstractC2832e3 = abstractC2832eArr[i8];
                            int i9 = abstractC2832e3 != null ? abstractC2832e3.f6806e : 0;
                            if (i7 < i9) {
                                abstractC2832e2 = abstractC2832e3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = abstractC2832e2 != null ? abstractC2832e2.f6806e : 0;
        }
        if (interfaceC13158e.mo398transient()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC2832e = abstractC2832eArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = abstractC2832e != null ? abstractC2832e.f6804e : 0;
                    if (1 <= i10) {
                        while (true) {
                            AbstractC2832e abstractC2832e4 = abstractC2832eArr[i];
                            int i12 = abstractC2832e4 != null ? abstractC2832e4.f6804e : 0;
                            if (i11 < i12) {
                                abstractC2832e = abstractC2832e4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = abstractC2832e != null ? abstractC2832e.f6804e : 0;
        }
        if (!interfaceC13158e.mo398transient()) {
            this.ad.metrica.setValue(new C12729e((i2 << 32) | (i3 & 4294967295L)));
        }
        return interfaceC13158e.ads(i2, i3, C9139e.f18290e, new C12815e(abstractC2832eArr, this, i2, i3));
    }
}
