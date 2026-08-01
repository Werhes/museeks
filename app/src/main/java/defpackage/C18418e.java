package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18418e {
    public ViewParent ad;
    public int[] appmetrica;
    public boolean license;
    public final ViewGroup metrica;
    public ViewParent vip;

    public C18418e(ViewGroup viewGroup) {
        this.metrica = viewGroup;
    }

    public final boolean ad(float f, float f2, boolean z) {
        ViewParent appmetrica;
        if (this.license && (appmetrica = appmetrica(0)) != null) {
            try {
                return appmetrica.onNestedFling(this.metrica, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + appmetrica + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final ViewParent appmetrica(int i) {
        if (i == 0) {
            return this.ad;
        }
        if (i != 1) {
            return null;
        }
        return this.vip;
    }

    public final boolean billing(int i, int i2) {
        boolean onStartNestedScroll;
        if (!purchase(i2)) {
            if (this.license) {
                View view = this.metrica;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC10856e;
                    if (z) {
                        onStartNestedScroll = ((InterfaceC10856e) parent).appmetrica(view2, view, i, i2);
                    } else {
                        if (i2 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i2 == 0) {
                            this.ad = parent;
                        } else if (i2 == 1) {
                            this.vip = parent;
                        }
                        if (z) {
                            ((InterfaceC10856e) parent).purchase(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean license(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent appmetrica;
        int i6;
        int i7;
        int[] iArr3;
        if (this.license && (appmetrica = appmetrica(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.metrica;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.appmetrica == null) {
                        this.appmetrica = new int[2];
                    }
                    int[] iArr4 = this.appmetrica;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (appmetrica instanceof InterfaceC11975e) {
                    ((InterfaceC11975e) appmetrica).metrica(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (appmetrica instanceof InterfaceC10856e) {
                        ((InterfaceC10856e) appmetrica).license(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            appmetrica.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + appmetrica + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean metrica(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent appmetrica;
        int i4;
        int i5;
        if (!this.license || (appmetrica = appmetrica(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.metrica;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.appmetrica == null) {
                this.appmetrica = new int[2];
            }
            iArr = this.appmetrica;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (appmetrica instanceof InterfaceC10856e) {
            ((InterfaceC10856e) appmetrica).yandex(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                appmetrica.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + appmetrica + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean purchase(int i) {
        return appmetrica(i) != null;
    }

    public final boolean vip(float f, float f2) {
        ViewParent appmetrica;
        if (this.license && (appmetrica = appmetrica(0)) != null) {
            try {
                return appmetrica.onNestedPreFling(this.metrica, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + appmetrica + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final void yandex(int i) {
        ViewParent appmetrica = appmetrica(i);
        if (appmetrica != null) {
            boolean z = appmetrica instanceof InterfaceC10856e;
            ViewGroup viewGroup = this.metrica;
            if (z) {
                ((InterfaceC10856e) appmetrica).billing(viewGroup, i);
            } else if (i == 0) {
                try {
                    appmetrica.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + appmetrica + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.ad = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.vip = null;
            }
        }
    }
}
